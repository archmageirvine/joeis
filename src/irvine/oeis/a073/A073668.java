package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A073668 Decimal expansion of Sum_{k&gt;=1} 1/(10^k - 1).
 * @author Sean A. Irvine
 */
public class A073668 extends DecimalExpansionSequence {

  protected A073668(final long r) {
    super(new CR() {
      @Override
      protected Z approximate(final int precision) {
        if (precision >= 0) {
          return Z.ZERO;
        }
        Z sum = Z.ZERO;
        final Z t = Z.ONE.shiftLeft(-precision);
        Z m = Z.ONE;
        for (int k = 1; k <= -precision; ++k) {
          m = m.multiply(r);
          sum = sum.add(t.divide(m.subtract(1)));
        }
        return sum;
      }
    });
  }

  /** Construct the sequence. */
  public A073668() {
    this(10);
  }
}
