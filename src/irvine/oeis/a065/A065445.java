package irvine.oeis.a065;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A065445 Decimal expansion of Product{k=0..inf} (1+1/2^(2k))^(1/2).
 * @author Sean A. Irvine
 */
public class A065445 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A065445() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = Z.ONE.shiftLeft(-precision);
        Z prod = one;
        int k = -1;
        while (true) {
          final Z t = one.add(one.divide(Z.ONE.shiftLeft(2L * ++k)));
          final Z prev = prod;
          prod = prod.multiply(t).shiftRight(-precision);
          if (prod.equals(prev)) {
            break;
          }
        }
        return prod;
      }
    }.sqrt());
  }
}
