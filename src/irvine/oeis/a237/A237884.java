package irvine.oeis.a237;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A237884 a(n) = (n!*m)/(m!*(m+1)!) where m = floor(n/2).
 * @author Georg Fischer
 */
public class A237884 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final int m = mN / 2;
    return MemoryFactorial.SINGLETON.factorial(mN).multiply(m).divide(MemoryFactorial.SINGLETON.factorial(m).multiply(MemoryFactorial.SINGLETON.factorial(m + 1)));
  }
}
