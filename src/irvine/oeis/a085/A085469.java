package irvine.oeis.a085;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085469 Decimal expansion of Madelung constant (negated) for NaCl structure.
 * @author Sean A. Irvine
 */
public class A085469 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A085469() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        long k = 0;
        while (true) {
          final long ks = (2 * k + 1) * (2 * k + 1);
          long j = 0;
          while (true) {
            final Z t = CR.HALF_PI.multiply(CR.valueOf((2 * j + 1) * (2 * j + 1) + ks).sqrt()).sech().square().getApprox(precision);
            if (t.isZero()) {
              if (j == 0) {
                return sum;
              }
              break;
            }
            sum = sum.add(t);
            ++j;
          }
          ++k;
        }
      }
    }.multiply(CR.PI).multiply(12));
  }
}

