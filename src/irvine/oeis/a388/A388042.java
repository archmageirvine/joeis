package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A083123 Smallest n-digit palindromic multiple of n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A388042 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388042() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        long k = -1;
        while (true) {
          ++k;
          final Z t = CrFunctions.EI.cr(-(2 * k + 1)).divide(2 * k + 1).getApprox(precision);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.signedAdd((k & 1) == 1, t);
        }
      }
    });
  }
}

