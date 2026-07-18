package irvine.oeis.a085;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085991 Decimal expansion of the prime zeta modulo function at 2 for primes of the form 4k+3.
 * @author Sean A. Irvine
 */
public class A085991 extends DecimalExpansionSequence {

  // This works but is very slow

  private static final Q THREE_QUARTERS = new Q(3, 4);

  static CR primeZeta43(final int s) {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        int n = -1;
        Z sum = Z.ZERO;
        while (true) {
          final int t = s + 2 * s * ++n;
          final int m = Functions.MOBIUS.i(2 * n + 1);
          if (m != 0) {
            final CR zh = Zeta.zetaHurwitz(t, Q.ONE_QUARTER).subtract(Zeta.zetaHurwitz(t, THREE_QUARTERS));
            final CR z = Zeta.zeta(t).divide(zh).multiply(Z.ONE.shiftLeft(2L * t).subtract(Z.ONE.shiftLeft(t))).log().divide(2L * n + 1);
            final Z v = z.getApprox(precision);
            if (v.isZero()) {
              return sum;
            }
            sum = sum.signedAdd(m == 1, v);
          }
        }
      }
    }.divide(2);
  }

  /** Construct the sequence. */
  public A085991() {
    super(0, primeZeta43(2), 10, 10);
  }
}
