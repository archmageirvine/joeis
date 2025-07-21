package irvine.oeis.a386;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A078800.
 * @author Sean A. Irvine
 */
public class A386009 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A386009() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Z one = CR.ONE.getApprox(precision);
        Z prod = CR.ONE.getApprox(precision);
        long k = 1;
        while (true) {
          ++k;
          final CR hk = CR.valueOf(new Q(k, 2));
          final Z t = CR.valueOf(k).pow(hk.pow(k - 1).divide(hk.exp().multiply(Functions.FACTORIAL.z(k)))).getApprox(precision);
          if (t.compareTo(one) <= 0) {
            return prod;
          }
          prod = prod.multiply(t).shiftRight(-precision);
        }
      }
    });
  }
}
