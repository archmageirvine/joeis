package irvine.oeis.a210;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.a146.A146305;
import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;


/**
 * A210696.
 * @author Sean A. Irvine
 */
public class A210696 implements Sequence {

  // Based on existing Maple program in OEIS entry (by R. J. Mathar)

  private final MemoryFactorial mF = new MemoryFactorial();
  private final A146305 mA146305 = new A146305();

  protected Z brownE(final int r, final int n, final int m) {
    if (r < 1) {
      return Z.ZERO;
    } else if (r == 1) {
      return mA146305.brownD(n, m);
    } else if (r == 2) {
      if ((m & 1) == 0) {
        return Z.ZERO;
      }
      final int j = n & 1;
      final int s = n / 2;
      final int p = (m + 1) / 2;
      if (p > 0 && s >= 0) {
        return mF.factorial(2 * p).multiply2().multiply(mF.factorial(4 * s + 2 * p + 2 * j - 1))
          .divide(mF.factorial(p)).divide(mF.factorial(p - 1))
          .divide(mF.factorial(s)).divide(mF.factorial(3 * s + 2 * p + 2 * j));
      } else {
        return Z.ZERO;
      }
    } else if (r == 3 && n % 3 == 0 && m % 3 == 0) {
      final int s = n / 3;
      final int p = m / 3;
      if (p >= 0 && s >= 0) {
        return mF.factorial(2 * p + 1).multiply(mF.factorial(4 * s + 2 * p))
          .divide(mF.factorial(p)).divide(mF.factorial(p))
          .divide(mF.factorial(s)).divide(mF.factorial(3 * s + 2 * p + 1));
      } else {
        return Z.ZERO;
      }
    } else {
      assert r >= 3;
      if ((n - 1) % r == 0 && (m + 3) % r == 0) {
        final int s = (n - 1) / r;
        final int p = (m + 3) / r - 1;
        if (p >= 0 && s >= 0) {
          return mF.factorial(2 * p + 2).multiply(mF.factorial(4 * s + 2 * p + 1))
            .divide(mF.factorial(p)).divide(mF.factorial(p + 1))
            .divide(mF.factorial(s)).divide(mF.factorial(3 * s + 2 * p + 2));
        }
      }
      return Z.ZERO;
    }
  }

  /**
   * Compute triangulations of the disk.
   * @param n index
   * @param m index
   * @return number of triangulations
   */
  public Z brownG(final int n, final int m) {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(m + 3).divisors()) {
      final int s = d.intValueExact();
      sum = sum.add(brownE(s, n, m).multiply(LongUtils.phi(s)));
    }
    return sum.divide(m + 3);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return brownG(1, ++mN);
  }
}
