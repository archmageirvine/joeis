package irvine.oeis.a241;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.a381.A381617;

/**
 * A241773 A sequence constructed by greedily sampling the Gauss-Kuzmin distribution log_2[(i+1)^2/(i^2+2*i)] to minimize discrepancy.
 * @author Sean A. Irvine
 */
public class A241773 extends A381617 {

  /** Construct the sequence. */
  public A241773() {
    super(new MemoryFunction1<>() {
      @Override
      protected CR compute(final int n) {
        return n == 0 ? CR.ZERO : CR.valueOf(new Q((n + 1L) * (n + 1), (long) n * n + 2L * n)).log().divide(CR.LOG2);
      }
    });
  }
}

