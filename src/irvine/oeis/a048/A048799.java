package irvine.oeis.a048;

import irvine.math.cr.CR;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a038.A038024;

/**
 * A048799 Decimal expansion of Sum_{n &gt;= 2} 1/S(n)!, where S(n) is the Kempner number A002034(n).
 * @author Sean A. Irvine
 */
public class A048799 extends DecimalExpansionSequence {

  private static final MemoryFactorial FACTORIAL = new MemoryFactorial();

  private static final CR N = new CR() {
    @Override
    protected Z approximate(final int precision) {
      Z sum = Z.ZERO;
      if (precision < 0) {
        final Sequence kempner = new SkipSequence(new A038024(), 1);
        int k = 1;
        Z u;
        do {
          u = kempner.next().shiftLeft(-precision).divide(FACTORIAL.factorial(++k));
          sum = sum.add(u);
        } while (!u.isZero());
      }
      return sum;
    }
  };

  @Override
  protected CR getCR() {
    return N;
  }
}
