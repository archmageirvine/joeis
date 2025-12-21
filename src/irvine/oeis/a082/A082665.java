package irvine.oeis.a082;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A082665 Decimal expansion of Y = Sum_{k&gt;2} 1/2^floor(k^log(log(k))).
 * @author Sean A. Irvine
 */
public class A082665 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A082665() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        final Z one = CR.ONE.getApprox(precision);
        long k = 2;
        while (true) {
          final CR z = CR.valueOf(++k);
          final CR ll = z.log().log();
          final Z t = one.shiftRight(z.pow(ll).floor().longValueExact());
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}
