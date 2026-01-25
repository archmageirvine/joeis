package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392411 allocated for Thaddanai Ratudom.
 * @author Sean A. Irvine
 */
public class A392411 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A392411() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        long p = 1;
        while (true) {
          p = Functions.NEXT_PRIME.l(p);
          final Z t = CR.GAMMA.pow(p).getApprox(precision);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.add(t);
        }
      }
    });
  }
}
