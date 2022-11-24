package irvine.oeis.a113;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A113550 a(n) = product of n successive numbers up to n, if n is odd a(n) = n*(n-1)*.. = n!,if n is even a(n) = n(n+1)(n+2)... &apos;n&apos; terms.
 * @author Georg Fischer
 */
public class A113550 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    // a(1) = 1, a(2n-1) = (2n-1)!, a(2n) = (4n-1)!/(2n-1)!.
    ++mN;
    return mN == 1 ? Z.ONE : (((mN & 1) == 1) ? MemoryFactorial.SINGLETON.factorial(mN)
      : MemoryFactorial.SINGLETON.factorial(2 * mN - 1).divide(MemoryFactorial.SINGLETON.factorial(mN - 1)));
  }
}
