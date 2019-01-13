package irvine.factor.gnfs;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import irvine.util.array.DynamicIntArray;
import irvine.util.array.DynamicShortArray;

/**
 * Makes use of a different hash structure to what is used in
 * Franke's C implementation, but produces the exact same result.
 *
 * HASHES is a pool used to store hash codes.  Each block of
 * HASH_BLOCK_LENGTH entries in HASHES is a block.  These blocks
 * are pointed to from <code>HASHTABLE</code>.  For a value i, <code>HASHTABLE[i]</code>
 * is the index of the first block for this hash value,
 * <code>HASHTABLE_COUNT[i]</code> is the total count of hashes with this
 * value, and <code>HASHCHAIN[i]</code> is the index of the next block in
 * <code>HASHTABLE</code> for this particular hash (or 0 if there are no more
 * block).
 *
 * Thus, <code>HASHTABLE</code>, <code>HASHCHAIN</code>, and HASHES grow slowly as more blocks
 * are needed. <code>HASHTABLE_COUNT</code> is fixed in length.  Other special
 * values cover the specific hash function used.
 *
 * @author Sean A. Irvine
 */
public class IncrementalHash {

  /** Hashing parameters and structure. */
  private static final int HASH_BITS = 20;
  private static final int HASHSIZE = 1 << HASH_BITS;
  private static final int HASHMASK = HASHSIZE - 1;
  private static final int HASH_BLOCK_LENGTH = 8;
  private static final int IDIND_BITS = 3;
  private static final int USHORT_MASK = ((short) ~0) - 1;

  private final DynamicIntArray mHashtable = new DynamicIntArray();
  private final DynamicIntArray mHashChain = new DynamicIntArray();
  private final DynamicShortArray mHashes = new DynamicShortArray();
  private final int[] mHashtableCount;
  private int mHashFree = 0;

  IncrementalHash() {
    mHashtable.set(HASHSIZE - 1, 0); // so we cat get values to this size
    mHashChain.set(HASHSIZE - 1, 0); // so we cat get values to this size
    mHashtable.truncate(HASHSIZE);
    mHashChain.truncate(HASHSIZE);
    mHashtableCount = new int[HASHSIZE];
  }

  void hash(final int ls, final byte ms) {
    final int hashval = ls & HASHMASK;
    int hindex = hashval;
    final int x = ((ls >>> HASH_BITS) << IDIND_BITS) + (ms & 0xFF);
    final short hashtag = (short) (x << 1);

    // check if already exists, if so mark as seen more than once
    int count = mHashtableCount[hashval];
    if (count == 0) {
      // never seen this hashval before, init an entry for it
      assert mHashtable.get(hashval) == 0;
      mHashtable.set(hashval, mHashFree);
      mHashChain.set(hashval, 0);
      mHashes.set(mHashFree, hashtag);
      mHashFree += HASH_BLOCK_LENGTH;
      mHashtableCount[hashval] = 1;
    } else {
      int offset, ohindex, i;
      do {
        offset = mHashtable.get(hindex);
        i = offset;
        do {
          if ((mHashes.get(i) & USHORT_MASK) == hashtag) {
            // seen it at least twice now
            mHashes.set(i, (short) (mHashes.get(i) | 1));
            return;
          }
          ++i;
        } while (--count != 0 && i < offset + HASH_BLOCK_LENGTH);
        ohindex = hindex;
        hindex = mHashChain.get(hindex);
      } while (count != 0);

      // the hashval/hashtag combination was not found
      assert hindex == 0;
      mHashtableCount[hashval]++;
      if (i != offset + HASH_BLOCK_LENGTH) {
        mHashes.set(i, hashtag);
      } else {
        // link new block into chain
        final int next = mHashChain.length();
        mHashChain.set(ohindex, next);
        mHashChain.set(next, 0);
        mHashtable.set(next, mHashFree);
        mHashes.set(mHashFree, hashtag);
        mHashFree += HASH_BLOCK_LENGTH;
      }
    }
  }

  void dump(final OutputStream os) throws IOException {
    final DataOutputStream dos = new DataOutputStream(os);
    for (final int cnt : mHashtableCount) {
      dos.writeInt(cnt);
    }
    for (int i = 0; i < mHashtableCount.length; ++i) {
      int count = mHashtableCount[i];
      int hindex = i;
      while (count != 0) {
        final int offset = mHashtable.get(hindex);
        for (int j = offset; count != 0 && j < offset + HASH_BLOCK_LENGTH; ++j, --count) {
          dos.writeShort(mHashes.get(j));
        }
        hindex = mHashChain.get(hindex);
      }
    }
    os.flush();
  }
}

