package irvine.oeis.a393;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.a386.A386016;

/**
 * A393663 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A393663 extends A386016 {

  /** Construct the sequence. */
  public A393663() {
    super(new MemoryFunction1<>() {
      @Override
      protected CR compute(final int n) {
        return Zeta.zeta(n + 1).subtract(1);
      }
    });
  }
}

