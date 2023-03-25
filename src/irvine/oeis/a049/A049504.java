package irvine.oeis.a049;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A049504 a(n) = Product_{i = 0..n-1} ((3*i+1)!*(6*i)!*(2*i)!)/((4*i)!*(4*i+1)!).
 * @author Sean A. Irvine
 */
public class A049504 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private Z mA = Z.ONE;
  private int mN = -2;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(mF.factorial(3 * mN + 1))
        .multiply(mF.factorial(6 * mN))
        .multiply(mF.factorial(2 * mN))
        .divide(mF.factorial(4 * mN))
        .divide(mF.factorial(4 * mN + 1));
    }
    return mA;
  }
}
