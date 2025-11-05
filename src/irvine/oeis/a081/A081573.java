package irvine.oeis.a081;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a032.A032634;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A081573 Decimal expansion of Sum_(1/(2^q-1)) with the summation extending over all pairs of integers gcd(p,q) = 1, 0 &lt; p/q &lt; e = 2.718... .
 * @author Sean A. Irvine
 */
public class A081573 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A081573() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence s = new A032634().skip();
        Z sum = Z.ZERO;
        while (true) {
          final Z t = Z.ONE.shiftLeft(-precision - s.next().longValueExact());
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}
