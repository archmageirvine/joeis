package irvine.oeis.a393;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.oeis.a386.A386016;

/**
 * A393100 A sequence constructed by greedily sampling the probability distribution given by 1/log_2(i+1) - 1/log_2(i+2) to minimize ratio discrepancy.
 * @author Sean A. Irvine
 */
public class A393100 extends A386016 {

  /** Construct the sequence. */
  public A393100() {
    super(new MemoryFunction1<>() {
      @Override
      protected CR compute(final int n) {
        return CR.valueOf(n + 1).log2().inverse().subtract(CR.valueOf(n + 2).log2().inverse());
      }
    });
  }
}

