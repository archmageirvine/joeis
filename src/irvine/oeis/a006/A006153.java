package irvine.oeis.a006;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006153 E.g.f.: <code>1/(1-x*exp(x))</code>.
 * @author Sean A. Irvine
 */
public class A006153 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(mF.factorial(mN).divide(mF.factorial(k)).multiply(Z.valueOf(mN - k).pow(k)));
    }
    return sum;
  }
}

