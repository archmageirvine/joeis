package irvine.oeis.a382;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a381.A381617;

/**
 * A382961 A sequence constructed by greedily sampling the logarithmic distribution for parameter value 1/2, 1/(log(2)*(2^i)*i) to minimize discrepancy.
 * @author Sean A. Irvine
 */
public class A382961 extends A381617 {

  /** Construct the sequence. */
  public A382961() {
    super(new MemoryFunction1<>() {
      @Override
      protected CR compute(final int n) {
        return n == 0 ? CR.ZERO : CR.LOG2.multiply(Z.valueOf(n).shiftLeft(n)).inverse();      }
    });
  }
}

