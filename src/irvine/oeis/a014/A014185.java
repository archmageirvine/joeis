package irvine.oeis.a014;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014185 Volume of (the dilation by 2) of the Relaxed Boolean Quadric polytope of order n.
 * @author Sean A. Irvine
 */
public class A014185 implements Sequence {

  private int mN = -1;
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    ++mN;
    return mF.factorial(Binomial.binomial(mN + 1, 2))
      .multiply(mF.factorial(mN))
      .shiftLeft(2 * mN)
      .divide(mF.factorial(2 * mN));
  }
}
