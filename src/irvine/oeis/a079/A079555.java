package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000009;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A079555 Decimal expansion of Product_{k&gt;=1} (1 + 1/2^k) = 2.384231029031371...
 * @author Sean A. Irvine
 */
public class A079555 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A079555() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence s = new A000009();
        Z sum = Z.ZERO;
        long k = -1;
        while (true) {
          final Z t = s.next().shiftRight(++k + precision);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}
