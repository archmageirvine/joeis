package irvine.oeis.a393;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.oeis.a386.A386016;

/**
 * A393100 allocated for Jwalin Bhatt.
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

