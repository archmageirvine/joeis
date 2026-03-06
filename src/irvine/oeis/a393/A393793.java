package irvine.oeis.a393;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.a381.A381617;

/**
 * A393793 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A393793 extends A381617 {

  /** Construct the sequence. */
  public A393793() {
    super(new MemoryFunction1<>() {
      @Override
      protected CR compute(final int n) {
        return Zeta.zeta(n + 1).subtract(1);
      }
    });
  }
}

