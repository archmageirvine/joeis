package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392777 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A392777 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A392777() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z prod = one;
        long k = 1;
        while (true) {
          final Z t = CR.valueOf(++k).pow(Zeta.zeta(k + 1).subtract(1)).getApprox(precision);
          if (t.compareTo(one) <= 0) {
            return prod;
          }
          prod = prod.multiply(t).shiftRight(-precision);
        }
      }
    });
  }
}

