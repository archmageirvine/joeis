package irvine.oeis.a210;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a146.A146305;


/**
 * A210696 Triangulations of the disk, G_{1,n}.
 * @author Sean A. Irvine
 */
public class A210696 extends Sequence0 {

  // Based on existing Maple program in OEIS entry (by R. J. Mathar)

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
        return Functions.FACTORIAL.z(2 * p).multiply2().multiply(Functions.FACTORIAL.z(4 * s + 2 * p + 2 * j - 1))
          .divide(Functions.FACTORIAL.z(p)).divide(Functions.FACTORIAL.z(p - 1))
          .divide(Functions.FACTORIAL.z(s)).divide(Functions.FACTORIAL.z(3 * s + 2 * p + 2 * j));
      } else {
        return Z.ZERO;
      }
    } else if (r == 3 && n % 3 == 0 && m % 3 == 0) {
      final int s = n / 3;
      final int p = m / 3;
      if (p >= 0 && s >= 0) {
        return Functions.FACTORIAL.z(2 * p + 1).multiply(Functions.FACTORIAL.z(4 * s + 2 * p))
          .divide(Functions.FACTORIAL.z(p)).divide(Functions.FACTORIAL.z(p))
          .divide(Functions.FACTORIAL.z(s)).divide(Functions.FACTORIAL.z(3 * s + 2 * p + 1));
      } else {
        return Z.ZERO;
      }
    } else {
      assert r >= 3;
      if ((n - 1) % r == 0 && (m + 3) % r == 0) {
        final int s = (n - 1) / r;
        final int p = (m + 3) / r - 1;
        if (p >= 0 && s >= 0) {
          return Functions.FACTORIAL.z(2 * p + 2).multiply(Functions.FACTORIAL.z(4 * s + 2 * p + 1))
            .divide(Functions.FACTORIAL.z(p)).divide(Functions.FACTORIAL.z(p + 1))
            .divide(Functions.FACTORIAL.z(s)).divide(Functions.FACTORIAL.z(3 * s + 2 * p + 2));
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
    for (final Z d : Jaguar.factor(m + 3).divisors()) {
      final int s = d.intValueExact();
      sum = sum.add(brownE(s, n, m).multiply(Functions.PHI.l(s)));
    }
    return sum.divide(m + 3);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return brownG(1, ++mN);
  }
}
