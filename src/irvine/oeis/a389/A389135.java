package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCrFunction;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389135 allocated for Kelvin Voskuijl.
 * @author Sean A. Irvine
 */
public class A389135 extends DecimalExpansionSequence {

  private static final Polynomial<Q> POLY = Polynomial.create(new Q(-2), Q.ONE, new Q(-9, 2), new Q(9, 2));

  /** Construct the sequence. */
  public A389135() {
    super(1, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        CR sum = CR.valueOf(POLY.coeff(0));
        for (int k = 1; k <= POLY.degree(); ++k) {
          final Q c = POLY.coeff(k);
          if (!c.isZero()) {
            sum = sum.add(ComputableReals.SINGLETON.pow(x, k).multiply(c));
          }
        }
        return sum;
      }
    }.inverseMonotone(CR.ONE, CR.TWO).execute(CR.ZERO));
  }
}
