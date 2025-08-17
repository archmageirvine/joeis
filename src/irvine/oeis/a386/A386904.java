package irvine.oeis.a386;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.oeis.a381.A381617;

/**
 * A383899 A sequence constructed by greedily sampling the Yule-Simon distribution for parameter value 1, to minimize discrepancy selecting the smallest value in case of ties.
 * @author Sean A. Irvine
 */
public class A386904 extends A381617 {

  /** Construct the sequence. */
  public A386904() {
    super(new MemoryFunction1<>() {
      @Override
      protected CR compute(final int n) {
        if (n == 0) {
          return CR.ZERO;
        }
        final CR z = CR.valueOf(new Q(n, 2));
        return z.pow(n - 1).divide(z.exp().multiply(Functions.FACTORIAL.z(n)));
      }
    });
  }
}

