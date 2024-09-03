package irvine.oeis.a256;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A256865 Numbers divisible by prime(d+1) for each digit d of their base-5 representation.
 * @author Georg Fischer
 */
public class A256865 extends AbstractSequence {

  private long mN;
  private final int mDist;
  private final int mBase;
  //                                    0  1  2  3  4  5  6  7  8  9 10 11 12
  private static final long[] PRIMES = {0, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37};

  /** Construct the sequence. */
  public A256865() {
    this(1, 1, 5);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param dist +1 or +0
   * @param base number base
   */
  public A256865(final int offset, final int dist, final int base) {
    super(offset);
    mN = -1;
    mDist = dist;
    mBase = base;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      boolean isOk = true;
      final int dc[] = ZUtils.digitCounts(mN, mBase);
      int idc = 0;
      if (mDist == 0) {
        while (isOk && idc < mBase) {
          if (dc[idc] > 0) {
            isOk = idc != 0 && mN % PRIMES[idc] == 0;
          }
          ++idc;
        }
      } else { // mDist == 1
        while (isOk && idc < mBase) {
          if (dc[idc] > 0) {
            isOk = mN % PRIMES[idc + 1] == 0;
          }
          ++idc;
        }
      }
      if (isOk) {
        return Z.valueOf(mN);
      }
    }
  }
}
