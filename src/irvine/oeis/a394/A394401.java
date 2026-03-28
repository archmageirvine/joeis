package irvine.oeis.a394;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.oeis.a381.A381617;

/**
 * A394401 A sequence constructed by greedily sampling the probability distribution given by 1/log_2(i+1) - 1/log_2(i+2) to minimize discrepancy.
 * @author Sean A. Irvine
 */
public class A394401 extends A381617 {

  /** Construct the sequence. */
  public A394401() {
    super(new MemoryFunction1<>() {
      @Override
      protected CR compute(final int n) {
        return CR.valueOf(n + 1).log2().inverse().subtract(CR.valueOf(n + 2).log2().inverse());
      }
    });
  }
}

