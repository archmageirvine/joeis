package irvine.oeis.a383;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.oeis.a381.A381617;

/**
 * A383238 A sequence constructed by greedily sampling the Poisson distribution for parameter value 1, 1/(e*(i-1)!) to minimize discrepancy.
 * @author Sean A. Irvine
 */
public class A383238 extends A381617 {

  /** Construct the sequence. */
  public A383238() {
    super(new MemoryFunction1<>() {
      @Override
      protected CR compute(final int n) {
        return n == 0 ? CR.ZERO : CR.E.multiply(Functions.FACTORIAL.z(n - 1)).inverse();
      }
    });
  }
}

