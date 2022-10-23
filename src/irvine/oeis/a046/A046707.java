package irvine.oeis.a046;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046707 a(n) = n!*Sum_{k=0..n/2} n^(2k)/(2k)!.
 * @author Sean A. Irvine
 */
public class A046707 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z n = Z.ONE;
    for (int k = 0; k <= mN / 2; ++k) {
      sum = sum.add(mF.factorial(mN).divide(mF.factorial(2 * k)).multiply(n));
      n = n.multiply(mN).multiply(mN);
    }
    return sum;
  }
}
