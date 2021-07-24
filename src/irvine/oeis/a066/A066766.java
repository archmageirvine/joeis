package irvine.oeis.a066;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A066766 Decimal expansion of Sum_{k&gt;=1} sigma(k)/2^k where sigma(k) is the sum of divisors of k, 1 &lt;= d &lt;= k.
 * @author Sean A. Irvine
 */
public class A066766 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A066766() {
    super(new CR() {
      @Override
      protected Z approximate(final int precision) {
        if (precision >= 0) {
          return Z.ZERO;
        }
        Z sum = Z.ZERO;
        int k = 0;
        while (true) {
          final Z t = Z.valueOf(++k).shiftLeft(-precision).divide(Z.ONE.shiftLeft(k).subtract(1));
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
