package irvine.oeis.a024;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024419 a(n) = n! (1/C(n,0) + 1/C(n,1) + ... + 1/C(n,[ n/2 ])).
 * @author Sean A. Irvine
 */
public class A024419 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN / 2; ++k) {
      sum = sum.add(mF.factorial(k).multiply(mF.factorial(mN - k)));
    }
    return sum;
  }
}
