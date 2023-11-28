package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicLongArray;
import irvine.util.array.LongDynamicIntArray;
import irvine.util.array.LongDynamicLongArray;

/**
 * A006455 Number of partial orders on {1,2,...,n} that are contained in the usual linear order (i.e., xRy =&gt; x&lt;y).
 * @author Sean A. Irvine
 */
public class A006455 extends Sequence0 {

  // After Knuth's cweb POSET program

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final LongDynamicLongArray mWt = new LongDynamicLongArray();
  private final LongDynamicIntArray mAux = new LongDynamicIntArray();
  private final LongDynamicIntArray mBits = new LongDynamicIntArray();
  private final LongDynamicLongArray mLink = new LongDynamicLongArray();
  private final DynamicLongArray mHash = new DynamicLongArray();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    if (mN == 13) {
      System.err.println("Results unverified from this point");
    }
    // These parameters ... some guesses
    final int memsize = 62500 * mN * mN; //9000000;
    final int thresh = 1 << Math.min(7, mN - 1); // This might need adjustment for mN > 10
    final int hashsize = 1 << Math.min(7, 9 + mN); //21;
    final int[] offset = new int[1 << (mN - 1)];

    int k = 1;
    int l = 2;
    for (int j = 0; l <= thresh; k++, l <<= 1) {
      offset[l - 1] = j;
      j += k;
    }
    for (int j = 0; l < 1 << mN; k++, l <<= 1) {
      offset[l - 1] = j;
      j += k;
    }

    long start = 0;
    mWt.set(start, 1);
    mAux.set(start, 0);
    mBits.set(start, 0);
    mLink.set(start, 0);
    long top = start + 1;
    int mask;
    long count;
    int curn;
    for (l = (1 << (mN - 1)) - 1, curn = mN; l > thresh; l >>>= 1, --curn) {
      final int hmask = (1 << offset[l]) - 1;
      for (int u = 0; u < hashsize; ++u) {
        mHash.set(u, 0);
      }
      count = 0;
      //System.out.println("SAI: " + curn + " " + l + " " + start + " " + top);
      long p = start;
      for (start = top; p != start; p = p == memsize - 1 ? 0 : p + 1) {
        ++count;
        //System.out.println("SAI: " + count + " " + start);
        mask = (mAux.get(p) >>> offset[l]) & l;
        for (int x = 0; x <= l; x = ((x | mask) + 1) & ~mask) {
          int curbits = mBits.get(p);
          int curaux = mAux.get(p);
          int t;
          int z;
          int y;
          for (y = x & (x + 1), t = ~x; y != 0; y -= z) {
            z = y & -y;
            if (z <= thresh) {
              curbits |= (t & (z - 1)) << offset[z - 1];
            } else {
              curaux |= (t & (z - 1)) << offset[z - 1];
            }
          }
          curaux &= hmask;
          final int h = (Long.hashCode(curbits) + Integer.hashCode(curaux)) & (hashsize - 1);
          long q;
          boolean ok = true;
          for (q = mHash.get(h); q != 0; q = mLink.get(q)) {
            if (mBits.get(q) == curbits && mAux.get(q) == curaux) {
              ok = false;
              break;
            }
          }
          if (ok) {
            q = top;
            if (q == p) {
              throw new OutOfMemoryError("Sorry, I need more memory!\n");
            }
            mBits.set(q, curbits);
            mAux.set(q, curaux);
            mWt.set(q, 0);
            mLink.set(q, mHash.get(h));
            mHash.set(h, q);
            top = q + 1;
            if (top == memsize) {
              top = 0;
            }
          }
          mWt.add(q, mWt.get(p));
        }
      }
      if (mVerbose) {
        System.out.printf(" %d item%s on list %d;%n", count, count > 1 ? "s" : "", curn);
      }
    }
    final long ostart = top;
    final long u = top % 3;
    if (u != 0) {
      top += 3 - u;
    }
    long p = start;
    for (start = top; p != ostart; p = p == memsize - 1 ? 0 : p + 1) {
      mWt.set(top, mWt.get(p));
      mAux.set(top, 0);
      mBits.set(top, mBits.get(p));
      top += 1;
      if (top == memsize) {
        top = 0;
      }
    }
    for (; l != 0; l >>>= 1, --curn) {
      final int hmask = (1 << offset[l]) - 1;
      for (int j = 0; j <= hmask; j++) {
        mHash.set(j, 0);
      }
      count = 0;
      p = start;
      for (start = top; p != start; p = p == memsize - 1 ? 0 : p + 1) {
        count++;
        mask = (mBits.get(p) >>> offset[l]) & l;
        for (int x = 0; x <= l; x = ((x | mask) + 1) & ~mask) {
          int curbits = mBits.get(p);
          int t;
          int y;
          int z;
          for (y = x & (x + 1), t = ~x; y != 0; y -= z) {
            z = y & -y;
            curbits |= (t & (z - 1)) << offset[z - 1];
          }
          y = curbits & hmask;
          long q = mHash.get(y);
          if (q == 0) {
            q = top;
            if (q == p) {
              throw new OutOfMemoryError("Sorry, I need more memory!");
            }
            mBits.set(q, curbits);
            mWt.set(q, 0);
            mAux.set(q, 0);
            mHash.set(y, q);
            top = q + 1;
            if (top == memsize) {
              top = 0;
            }
          }
          mWt.add(q, mWt.get(p));
        }
      }
      if (mVerbose) {
        System.out.printf(" %d items on list %d;%n", count, curn);
      }
    }
    return Z.valueOf(mWt.get(start));
  }

  // Simpler implementation based on Knuth's POSET0.  Much slower for larger n
//  @Override
//  public Z nextQ() {
//    if (++mN < 2) {
//      return Z.ONE;
//    } else if (mN == 2) {
//      return Z.TWO;
//    }
//    final int nn = 1 << (mN - 1);
//    final int[] row = new int[nn + 1];
//    final int[] mask = new int[nn + (nn >> 1) + 1];
//
//    long sols = 0;
//    int l = nn;
//    while (true) {
//      if (l == 2) {
//        sols += 2 - (mask[2] & 1);
//        int x;
//        while (true) {
//          l <<= 1;
//          x = row[l];
//          int z;
//          for (int y = x & (x + 1); y != 0; y -= z) {
//            z = y & -y;
//            mask[z] = mask[l + z];
//          }
//          x = (x | mask[l]) + 1;
//          if (x >= l) {
//            if (l == nn) {
//              return Z.valueOf(sols);
//            }
//          } else {
//            break;
//          }
//        }
//        x = x & ~mask[l];
//        row[l] = x;
//        int z;
//        int y;
//        for (y = x & (x + 1), x = ~x; y != 0; y -= z) {
//          z = y & -y;
//          mask[l + z] = mask[z];
//          mask[z] |= x;
//        }
//        l >>= 1;
//      } else {
//        mask[l] &= l - 1;
//        row[l] = 0;
//        l >>= 1;
//      }
//    }
//  }
}
