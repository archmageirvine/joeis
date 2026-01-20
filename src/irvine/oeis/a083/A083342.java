package irvine.oeis.a083;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A083342 Decimal expansion of average deviation of the total number of prime factors.
 * @author Sean A. Irvine
 */
public class A083342 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A083342() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        int k = 1;
        Z sum = Z.ZERO;
        while (true) {
          final Z t = Zeta.zeta(++k).log().multiply(Functions.PHI.l(k)).divide(k).getApprox(precision);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    }.add(CR.GAMMA));
  }
}
