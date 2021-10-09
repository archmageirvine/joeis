package irvine.oeis.a160;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A160386 Decimal expansion of Sum_{n&gt;=0}(-1)^n/3^(2^n).
 * @author Sean A. Irvine
 */
public class A160386 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A160386() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = Z.ONE.shiftLeft(-precision);
        Z sum = Z.ZERO;
        int k = -1;
        while (true) {
          final int shift = 1 << ++k;
          final Z t = one.divide(Z.THREE.pow(shift));
          if (t.isZero()) {
            break;
          }
          sum = sum.signedAdd((k & 1) == 0, t);
        }
        return sum;
      }
    });
  }
}
