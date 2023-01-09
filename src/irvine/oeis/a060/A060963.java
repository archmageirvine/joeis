package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A060963 Number of pairings of the first 2n positive integers so that the absolute differences of each pair are different.
 * @author Edward Moody
 * @author Sean A. Irvine (adaptation to jOEIS)
 */
public class A060963 extends Sequence0 {

  // See https://github.com/EdwardMGraphite/generalised-langford

  // README associated with original program:

  /*
    This program enumerates all the of ways of arranging two copies of
    each of the numbers from 1 to N such that either:
    
    d(N) > d(N - 1) > d(N - 2) > ... > d(2) > d(1) >= 0    (strongly descending)
    
    or
    
    d(N) >= d(N - 1) >= d(N - 2) >= ... >= d(2) >= d(1) >= 0    (weakly descending)
    
    where d(k) is the number of entries in the sequence between the two
    instances of k.
    
    These two sequences are https://oeis.org/A060963 and
    https://oeis.org/A322178 respectively, in the Online Encyclopedia of
    Integer Sequences.
    
    To make sufficient space available to use the large cache it may be
    necessary to run the program with such VM arguments as:
    
    -d64 -Xmx14g -XX:NewRatio=32
    
    for example.
    
    The program attempts to fit numbers into the sequence in descending
    order of size. Suppose, for example that the '6's were added to the
    sequence with 8 intervening entries. In the strongly descending
    case, the program will attempt to place the '5's with 7, 6, 5, or 4
    intervening entries, because the remaining four pairs could, at a
    minimum, have 3, 2, 1, and 0 intervening entries. In the weakly
    descending case, the program will attempt to place the '5's with 8,
    7, 6, 5, 4, 3, 2, 1, or 0 intervening entries.
    
    At each point, before attempting to place the next pair in the
    sequence, the program refers to its cache to see if it has
    calculated the number of arrangements that can be achieved from the
    current position before. The keys to the entries in the cache
    consist of the maximum available separation for the remaining
    entries in the sequence, concatenated with the pattern of occupied
    and unoccupied spaces.
  */

  /**
   * Storage capacity is <code>multiplier * 2^hashLength</code>
   */
  private static class LongLongMap2 {
    private final int mHashLength;
    private final long[] mArray;
    private final int mRecordLength;
    private final int mMultiplier;
    private final int mValueBits;
    private final int mPointerBits;
    private final int mMaxPointer;
    private final int mKeyLength;
    private final long mMaxValue;
    private int mSize = 0;
    private final int mStorage;
    private boolean mFull;
    private long mNoSpaceFound = 0;
    private long mValueTooLarge = 0;
    private int mMaxPointerSearch = 0;

    LongLongMap2(final int keyLength, final int hashLength, final int multiplier, final int valueBits, final int pointerBits) {
      mStorage = (int) (Math.pow(2, hashLength) * multiplier);
      mHashLength = hashLength;
      mMultiplier = multiplier;
      mValueBits = valueBits;
      mPointerBits = pointerBits;
      mKeyLength = keyLength;
      mMaxPointer = (int) (Math.pow(2, pointerBits));
      mMaxValue = (long) (Math.pow(2, valueBits) - 1);
      mRecordLength = 1 + (keyLength - hashLength) + pointerBits + valueBits;
      mArray = new long[(int) (1 + (((long) mStorage) * mRecordLength / 64))];
    }

    private long getField(final long address, final int bitCount, final int bitStart) {
      int index = (int) ((address * mRecordLength + bitStart) / 64);
      final long offset = (address * mRecordLength + bitStart) % 64;
      long result = (mArray[index] << offset) >>> (64 - bitCount);
      if (offset + bitCount > 64) {
        index = index + 1;
        result |= mArray[index] >>> (64 - (offset + bitCount - 64));
      }
      return result;
    }

    private boolean isRecordUsed(final long address) {
      return getField(address, 1, 0) == 1;
    }

    private long getKeyBits(final long address) {
      return getField(address, mKeyLength - mHashLength, 1);
    }

    private int getPointer(final long address) {
      return (int) getField(address, mPointerBits, 1 + (mKeyLength - mHashLength));
    }

    private long getValue(final long address) {
      return getField(address, mValueBits, mRecordLength - mValueBits);
    }

    private void writeField(final long address, final int bitCount, final int bitStart, final long value) {
      final int index = (int) ((address * mRecordLength + bitStart) / 64);
      final long offset = (address * mRecordLength + bitStart) % 64;

      if (offset + bitCount < 64) {
        long newEntry = mArray[index] >>> (64 - offset) << (64 - offset);
        newEntry |= mArray[index] << (offset + bitCount) >>> (offset + bitCount);
        newEntry |= value << (64 - offset - bitCount);
        mArray[index] = newEntry;
      } else if (offset + bitCount > 64) {
        long newEntry = mArray[index] >>> (64 - offset) << (64 - offset);
        newEntry |= value >>> (offset + bitCount - 64);
        mArray[index] = newEntry;
        newEntry = mArray[index + 1] << (offset + bitCount - 64) >>> (offset + bitCount - 64);
        newEntry |= value << (64 - (offset + bitCount - 64));
        mArray[index + 1] = newEntry;
      } else {
        mArray[index] = (mArray[index] >>> bitCount) << bitCount;
        mArray[index] |= value;
      }
    }

    private void setRecordUsed(final long address, final boolean used) {
      writeField(address, 1, 0, used ? 1 : 0);
    }

    private void setKey(final long address, final long key) {
      writeField(address, mKeyLength - mHashLength, 1, key);
    }

    private void setPointer(final long address, final int pointer) {
      writeField(address, mPointerBits, 1 + (mKeyLength - mHashLength), pointer);
    }

    private boolean setValue(final long address, final long value) {
      if (value > mMaxValue) {
        mValueTooLarge++;
        return false;
      } else {
        writeField(address, mValueBits, mRecordLength - mValueBits, value);
        return true;
      }
    }

    long get(long key) {
      int address = mMultiplier * getHash(key);
      key = key >>> mHashLength;

      while (isRecordUsed(address)) {
        final long trialKey = getKeyBits(address);
        if (trialKey == key) {
          return getValue(address);
        }
        final int pointer = getPointer(address);
        if (pointer > 0) {
          address = getPointerAddress(address, pointer);
        } else {
          break;
        }
      }
      return -1;
    }

    void put(long key, final long value) {
      if (mFull) {
        return;
      }
      int address = mMultiplier * getHash(key);
      key = key >>> mHashLength;
      int pointer = 0;
      int oldAddress = -1;

      while (true) {
        if (!isRecordUsed(address)) {
          if (setValue(address, value)) {
            if (++mSize == mStorage) {
              mFull = true;
            }
            setRecordUsed(address, true);
            setKey(address, key);
            if (pointer > 0 && oldAddress >= 0) {
              setPointer(oldAddress, pointer);
            }
          }
          return;
        }
        final long trialKey = getKeyBits(address);
        if (trialKey == key) {
          setValue(address, value);
          return;
        }
        pointer = getPointer(address);
        if (pointer != 0) {
          address = getPointerAddress(address, pointer);
          continue;
        }
        for (int i = 1; i < mMaxPointer; ++i) {
          if (i > mMaxPointerSearch) {
            mMaxPointerSearch = i;
          }
          if (getPointerAddress(address, i) % mMultiplier == 0) {
            continue;
          }
          if (!isRecordUsed(getPointerAddress(address, i))) {
            oldAddress = address;
            address = getPointerAddress(address, i);
            pointer = i;
            break;
          }
        }
        if (oldAddress >= 0) {
          continue;
        }
        ++mNoSpaceFound;
        return;
      }
    }

    private int getHash(final long key) {
      return (((int) (key ^ (key >>> 32))) << (32 - mHashLength)) >>> (32 - mHashLength);
    }

    private int getPointerAddress(final int address, final int pointer) {
      return Math.abs((address + (pointer * pointer * pointer)) % mStorage);
    }

    int size() {
      return mSize;
    }

    long getNoSpaceFound() {
      return mNoSpaceFound;
    }

    long getValueTooLarge() {
      return mValueTooLarge;
    }

    int getMaxPointerSearch() {
      return mMaxPointerSearch;
    }
  }

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final boolean mStronglyDecreasing;
  private int mN = -1;
  private int mLength = 0;
  private long[] mPowers = null;
  private LongLongMap2 mMemo = null;
  private long[] mWork;
  private long mLeftBitmask;

  protected A060963(final boolean stronglyDecreasing) {
    mStronglyDecreasing = stronglyDecreasing;
  }

  /** Construct the sequence. */
  public A060963() {
    this(true);
  }

  private long recurse(final int[] digits, final int n, final long used, final long mirrorUsed, final int maxNumberAvailable) {
    mWork[n] = mWork[n] + 1;
    if (n == 0) {
      return 1;
    }
    long cacheValue;
    long shiftedUsed = used;
    while ((shiftedUsed & mLeftBitmask) != 0) {
      shiftedUsed = ((shiftedUsed ^ mLeftBitmask) << 1) + 1;
    }
    shiftedUsed |= ((long) maxNumberAvailable) << mLength;

    cacheValue = mMemo.get(shiftedUsed);
    if (cacheValue != -1) {
      return cacheValue;
    }
    long shiftedMirrorUsed = mirrorUsed;
    while ((shiftedMirrorUsed & mLeftBitmask) != 0) {
      shiftedMirrorUsed = ((shiftedMirrorUsed ^ mLeftBitmask) << 1) + 1;
    }
    shiftedMirrorUsed |= ((long) maxNumberAvailable) << mLength;
    cacheValue = mMemo.get(shiftedMirrorUsed);
    if (cacheValue != -1) {
      return cacheValue;
    }

    long counter = 0;
    if (maxNumberAvailable != 0) {
      int gaps = 0;
      int filled = 0;
      int compulsory = 0;
      for (int i = 0; i < mLength; ++i) {
        if (digits[i] == 0) {
          if (filled > maxNumberAvailable && gaps % 2 == 1) {
            mMemo.put(shiftedUsed, 0);
            return 0;
          } else if (mStronglyDecreasing && filled == maxNumberAvailable && gaps % 2 == 1) {
            if (compulsory != 0) {
              mMemo.put(shiftedUsed, 0);
              return 0;
            }
            compulsory = i;
          }
          ++gaps;
          filled = 0;
        } else {
          ++filled;
        }
      }

      if (compulsory != 0) {
        digits[compulsory] = n;
        digits[compulsory - maxNumberAvailable - 1] = n;
        counter = recurse(digits, n - 1, n > 1 ? used + mPowers[compulsory] + mPowers[compulsory - maxNumberAvailable - 1] : used,
          n > 1 ? mirrorUsed + mPowers[mLength - compulsory - 1] + mPowers[mLength - compulsory + maxNumberAvailable] : mirrorUsed, maxNumberAvailable - 1);
        digits[compulsory] = 0;
        digits[compulsory - maxNumberAvailable - 1] = 0;
        mMemo.put(shiftedUsed, counter);
        return counter;
      }
    }
    for (int num = maxNumberAvailable; num >= (mStronglyDecreasing ? n - 1 : 0); --num) {
      for (int i = 0; i < mLength - num - 1; ++i) {
        if (digits[i] == 0 && digits[i + num + 1] == 0) {
          digits[i] = n;
          digits[i + num + 1] = n;
          counter += recurse(digits, n - 1, n > 1 ? used + mPowers[i] + mPowers[i + num + 1] : used,
            n > 1 ? mirrorUsed + mPowers[mLength - 1 - i] + mPowers[digits.length - 2 - i - num] : mirrorUsed, num - (mStronglyDecreasing ? 1 : 0));
          if (mVerbose && n == mN) {
            StringUtils.message("Num= " + num + ", i= " + i + ", " + mMemo.size() + " in cache, " + counter + " solutions, NSF=" + mMemo.getNoSpaceFound() + ", VTL=" + mMemo.getValueTooLarge() + ", MPS=" + mMemo.getMaxPointerSearch());
          }
          digits[i] = 0;
          digits[i + num + 1] = 0;
        }
      }
    }

    mMemo.put(shiftedUsed, counter);
    return counter;

  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mLength = mN * 2;
    mMemo = new LongLongMap2(mLength + 5, //key length of the cache, in bits
      mLength > 25 ? 28 : mLength + 4, //hashLength in bits
      6, //multiplier, storage capacity of the cache = multiplier * 2^hashLength
      //A multiplier of 6 is sufficient for n = 15 (A060963) and n = 14 (A322178)
      //A multiplier of 7 is required for the next values
      36, //Bits available for storing values in the cache, larger values will not be stored,
      //but since there will be relatively few of these, performance will not be unduly affected
      12);
    mPowers = new long[mLength];
    mPowers[0] = 1;
    for (int i = 1; i < mLength; ++i) {
      mPowers[i] = 2 * mPowers[i - 1];
    }

    mLeftBitmask = mPowers[mLength - 1];

    mWork = new long[mN + 1];

    final int[] digits = new int[mLength];
    if (mVerbose) {
      StringUtils.message("Starting");
    }
    final long res = recurse(digits, mN, 0, 0, mLength - 2);
    if (mVerbose) {
      long totalWork = 0;
      for (int i = 0; i < mN + 1; ++i) {
        StringUtils.message(i + ": work = " + mWork[i]);
        if (i > 0) {
          totalWork += mWork[i];
        }
      }
      StringUtils.message(totalWork + " total work");
      StringUtils.message(mMemo.size() + " entries in cache");
    }
    return Z.valueOf(res);
  }
}
