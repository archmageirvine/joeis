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

  // This is slow ... and heuristic ...

  private static final long HEURISTIC_TERMS = 10000;
  private long mN = 1;

  /** Construct the sequence. */
  protected A052434() {
    super(2);
    super.next();
  }

  protected CR riemann(final long n) {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final CR ncr = CR.valueOf(n);
        Z sum = Z.ZERO;
        long k = 0;
        while (true) {
          final CR kcr = CR.valueOf(++k);
          final Z t = ncr.pow(kcr.inverse()).li().divide(kcr).getApprox(precision);
          if (t.isZero() || k > HEURISTIC_TERMS) {
            break;
          }
          final int mobius = Mobius.mobius(k);
          if (mobius != 0) {
            sum = sum.signedAdd(mobius == 1, t);
          }
        }
        return sum;
      }
    };
  }

  @Override
  public Z next() {
    final CR r = riemann(++mN);
    //System.out.println(mN + " R=" + r);
    return r.subtract(CR.valueOf(super.next())).round();
  }
}
