package irvine.oeis.a065;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A065446 Decimal expansion of Product_{k&gt;=1} (1-1/2^k)^(-1).
 * @author Sean A. Irvine
 */
public class A065446 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A065446() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = Z.ONE.shiftLeft(-precision);
        Z prod = one;
        int k = 0;
        while (true) {
          final Z t = one.subtract(one.divide(Z.ONE.shiftLeft(++k)));
          final Z prev = prod;
          prod = prod.multiply(t).shiftRight(-precision);
          if (prod.equals(prev)) {
            break;
          }
        }
        return prod;
      }
    }.inverse());
  }
}
