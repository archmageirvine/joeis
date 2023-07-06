package irvine.oeis.a048;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002034;

/**
 * A048837 Decimal expansion of Sum_{n &gt;= 2} (n^2 / Product_{i=2..n} K(i)), where K(i) is the Kempner function A002034.
 * @author Sean A. Irvine
 */
public class A048837 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A048837() {
    super(new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        if (precision < 0) {
          final Sequence kempner = new A002034().skip(1);
          Z prod = Z.ONE;
          Z u;
          long k = 1;
          do {
            prod = prod.multiply(kempner.next());
            u = Z.valueOf(++k).square().shiftLeft(-precision).divide(prod);
            sum = sum.add(u);
          } while (!u.isZero());
        }
        return sum;
      }
    });
  }
}
