package irvine.oeis.a394;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A305213.
 * @author Sean A. Irvine
 */
public class A394496 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A394496() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        long k = 0;
        while (true) {
          ++k;
          final Z t = CR.TAU.pow(2 * k).divide(Functions.FACTORIAL.z(2 * k + 1)).multiply(Zeta.zeta(2 * k).subtract(CR.ONE).subtract(CR.valueOf(Z.ONE.shiftLeft(2 * k)).inverse())).getApprox(precision);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t.multiply(Z.NEG_ONE.pow(k + 1)));
        }
      }
    }.divide(CR.TWO));
  }
}
