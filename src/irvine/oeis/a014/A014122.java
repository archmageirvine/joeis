package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014122.
 * @author Sean A. Irvine
 */
public class A014122 implements Sequence {

  // Heuristic

  private long mN = -1;

  private boolean isPowerOfThree(long n) {
    while (n > 1) {
      if (n % 3 != 0) {
        return false;
      }
      n /= 3;
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if ((++mN & 1) == 0) {
        // Handle even cases, 3^k +/- 1 are the only even members
        if (isPowerOfThree(mN - 1) || isPowerOfThree(mN + 1)) {
          return Z.valueOf(mN);
        }
      } else if (mN % 3 == 0) {
        // 3k == 2^k +/- 1 are members (note n & (n-1) is test for power of 2)
        if (((mN + 1) & mN) == 0 || ((mN - 1) & (mN - 2)) == 0) {
          return Z.valueOf(mN);
        }
      } else {
        Z threes = Z.ONE;
        for (long k = 0; k <= mN; ++k, threes = threes.multiply(3)) {
          if (A014121.isPowerOf2(threes.add(mN))) {
            return Z.valueOf(mN);
          }
          if (A014121.isPowerOf2(threes.subtract(mN))) {
            return Z.valueOf(mN);
          }
          if (A014121.isPowerOf2(threes.negate().add(mN).abs())) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
