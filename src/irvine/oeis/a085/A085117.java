package irvine.oeis.a085;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085117 Decimal expansion of largest Stoneham number S(3,2).
 * @author Sean A. Irvine
 */
public class A085117 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A085117() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        long k = 0;
        Z sum = Z.ZERO;
        while (true) {
          final Z t = one.divide(Z.THREE.pow(1L << ++k)).shiftRight(k);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}

