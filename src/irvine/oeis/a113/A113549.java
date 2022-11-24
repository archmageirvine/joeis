package irvine.oeis.a113;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A113549 a(n) = product of n successive numbers up to n, if n is even a(n) = n*(n-1)*.. = n!,
 * if n is odd a(n) = n(n+1)(n+2)... &apos;n&apos; terms.
 * @author Georg Fischer
 */
public class A113549 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    // a(1) = 1, a(2n) = (2n)!, a(2n-1) = (4n-3)!/(2n-2)!.
    ++mN;
    return mN == 1 ? Z.ONE : (((mN & 1) == 0) ? MemoryFactorial.SINGLETON.factorial(mN)
      : MemoryFactorial.SINGLETON.factorial(2 * mN - 1).divide(MemoryFactorial.SINGLETON.factorial(mN - 1)));
  }
}
