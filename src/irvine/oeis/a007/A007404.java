package irvine.oeis.a007;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A007404 Decimal expansion of Sum_{n&gt;=0} 1/2^(2^n).
 * @author Sean A. Irvine
 */
public class A007404 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A007404() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z sum = one.divide2(); // 1/2
        int k = 0;
        while (true) {
          final Z t = one.divide(Z.ONE.shiftLeft(1 << ++k));
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
