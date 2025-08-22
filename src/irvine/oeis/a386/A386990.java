package irvine.oeis.a386;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A386990 Decimal expansion of Sum_{k&gt;=0} 2/(k!*(k! + 1)).
 * @author Sean A. Irvine
 */
public class A386990 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A386990() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        final Z two = CR.TWO.getApprox(precision);
        long k = -1;
        while (true) {
          final Z f = Functions.FACTORIAL.z(++k);
          final Z t = two.divide(f.multiply(f.add(1)));
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}
