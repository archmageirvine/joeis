package irvine.oeis.a394;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.a386.A386016;

/**
 * A394370 A sequence constructed by greedily sampling the probability distribution given by log_2(1+1/i)^2 - log_2(1+1/(i+1))^2 to minimize ratio discrepancy.
 * @author Sean A. Irvine
 */
public class A394370 extends A386016 {

  /** Construct the sequence. */
  public A394370() {
    super(new MemoryFunction1<>() {
      @Override
      protected CR compute(final int n) {
        return n == 0 ? CR.ZERO : CR.valueOf(new Q(n + 1, n)).log2().square().subtract(CR.valueOf(new Q(n + 2, n + 1)).log2().square());
      }
    });
  }
}

