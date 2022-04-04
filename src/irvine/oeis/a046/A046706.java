package irvine.oeis.a046;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046706 a(n) = (1/2)*(n+1)!*Sum_{k=0..floor(n/2)} n^(2k+1)/(2k+1)!.
 * @author Sean A. Irvine
 */
public class A046706 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z n = Z.valueOf(mN);
    for (int k = 0; k <= mN / 2; ++k) {
      sum = sum.add(mF.factorial(mN + 1).divide(mF.factorial(2 * k + 1)).multiply(n));
      n = n.multiply(mN).multiply(mN);
    }
    return sum.divide2();
  }
}
