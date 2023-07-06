package irvine.oeis.a048;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002034;

/**
 * A048834 Decimal expansion of Sum_{n &gt;= 2} (K(n)/n!), where K(n) is A002034.
 * @author Sean A. Irvine
 */
public class A048834 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A048834() {
    super(new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        if (precision < 0) {
          final Sequence kempner = new A002034().skip(1);
          int k = 1;
          Z f = Z.ONE;
          Z u;
          do {
            f = f.multiply(++k);
            u = kempner.next().shiftLeft(-precision).divide(f);
            sum = sum.add(u);
          } while (!u.isZero());
        }
        return sum;
      }
    });
  }
}
