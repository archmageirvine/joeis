package irvine.oeis.a383;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.oeis.a381.A381617;

/**
 * A383899 A sequence constructed by greedily sampling the Yule-Simon distribution for parameter value 1, to minimize discrepancy selecting the smallest value in case of ties.
 * @author Sean A. Irvine
 */
public class A383899 extends A381617 {

  /** Construct the sequence. */
  public A383899() {
    super(new MemoryFunction1<>() {
      @Override
      protected CR compute(final int n) {
        return n == 0 ? CR.ZERO : CR.valueOf(n * (n + 1)).inverse();
      }
    });
  }
}

