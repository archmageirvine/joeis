package irvine.oeis.a154;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A154028 a(2n) = n*(n+1)/2, a(2n+1) = n!.
 * @author Georg Fischer
 */
public class A154028 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final int n = mN / 2;
    return ((mN & 1) == 0) ? Z.valueOf(n).multiply(n + 1).divide2() : MemoryFactorial.SINGLETON.factorial(n);
  }
}
