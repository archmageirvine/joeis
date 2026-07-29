package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395680 Decimal expansion of the constant d = Product_{n&gt;=0} (1 - 1/(2*n!+1)).
 * @author Sean A. Irvine
 */
public class A395680 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395680() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z prod = one;
        long k = -1;
        while (true) {
          final Z t = one.subtract(one.divide(Functions.FACTORIAL.z(++k).multiply2().add(1)));
          if (t.equals(one)) {
            return prod;
          }
          prod = prod.multiply(t).shiftRight(-precision);
        }
      }
    });
  }
}
