package irvine.oeis.a385;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.oeis.a381.A381617;

/**
 * A385873 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A385873 extends A381617 {

  /** Construct the sequence. */
  public A385873() {
    super(new MemoryFunction1<>() {
      @Override
      protected CR compute(final int n) {
        return n == 0 ? CR.ZERO : CR.E.subtract(1).multiply(Functions.FACTORIAL.z(n)).inverse();
      }
    });
  }
}

