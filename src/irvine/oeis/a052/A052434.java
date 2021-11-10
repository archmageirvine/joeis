package irvine.oeis.a052;

import irvine.math.Mobius;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A052434 Nearest integer to R(n) - pi(n), where R(x) is the Riemann prime counting function.
 * @author Sean A. Irvine
 */
public class A052434 extends A000720 {

  // todo this has insufficient accuracy

  private long mN = 1;
  {
    super.next();
  }

  private CR riemann(final long n) {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final CR ncr = CR.valueOf(n);
        Z sum = Z.ZERO;
        long k = 0;
        while (true) {
          final CR kcr = CR.valueOf(++k);
          final Z t = ncr.pow(kcr.inverse()).li().divide(kcr).getApprox(precision);
          if (t.isZero() || k > 10000) {
            break;
          }
          final int mobius = Mobius.mobius(k);
          if (mobius != 0) {
            sum = sum.signedAdd(mobius == 1, t);
          }
          //System.out.println("n=" + n + " R=" + sum + " t=" + t);
        }
        return sum;
      }
    };
  }

  @Override
  public Z next() {
    return riemann(++mN).subtract(CR.valueOf(super.next())).round();
  }
}
