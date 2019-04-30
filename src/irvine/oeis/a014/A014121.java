package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014121 Numbers of form <code>|2^i-3^j|</code>.
 * @author Sean A. Irvine
 */
public class A014121 implements Sequence {

  // Heuristic

  private long mN = -1;

  static boolean isPowerOf2(final Z n) {
    return !Z.ZERO.equals(n) && Z.ZERO.equals(n.and(n.subtract(1)));
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      Z threes = Z.ONE;
      for (long k = 0; k <= mN; ++k, threes = threes.multiply(3)) {
        if (isPowerOf2(threes.add(mN))) {
          return Z.valueOf(mN);
        }
        if (isPowerOf2(threes.subtract(mN))) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
