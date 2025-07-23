package irvine.oeis.a078;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A078885 Decimal expansion of Sum {n&gt;=0} 1/3^(2^n).
 * @author Sean A. Irvine
 */
public class A078885 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A078885() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z sum = one.divide(3); // 1/3
        int k = 0;
        while (true) {
          final Z t = one.divide(Z.THREE.pow(1L << ++k));
          if (t.isZero()) {
            break;
          }
          sum = sum.add(t);
        }
        return sum;
      }
    });
  }
}
