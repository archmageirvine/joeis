package irvine.oeis.a048;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a002.A002034;

/**
 * A048835 Decimal expansion of Sum_{n &gt;= 2} (1/Product_{i &gt;= 2} K(i)) where K(n) is the Kempner function A002034.
 * @author Sean A. Irvine
 */
public class A048835 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A048835() {
    super(new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        if (precision < 0) {
          final Sequence kempner = new SkipSequence(new A002034(), 1);
          Z t = Z.ONE.shiftLeft(-precision);
          Z prod = Z.ONE;
          Z u;
          do {
            prod = prod.multiply(kempner.next());
            u = t.divide(prod);
            sum = sum.add(u);
          } while (!u.isZero());
        }
        return sum;
      }
    });
  }
}
