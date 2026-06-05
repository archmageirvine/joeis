package irvine.oeis.a085;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085138 Decimal expansion of largest "base 10" Stoneham number.
 * @author Sean A. Irvine
 */
public class A085138 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A085138() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        long k = 0;
        Z sum = Z.ZERO;
        while (true) {
          final Z p = Z.TEN.pow(++k);
          final Z t = one.divide(Z.THREE.pow(p.longValueExact())).divide(p);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}

