package irvine.oeis.a199;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A199660 Number of parity alternating permutations of [n] avoiding descents from odd to even numbers.
 * @author Georg Fischer
 */
public class A199660 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    // a(2*n) = (2^n+n-1)*(n-1)! for n>0, a(2*n+1) = n!, a(0) = 1.
    ++mN;
    final int n = mN / 2;
    if (mN == 0) {
      return Z.ONE;
    }
    return ((mN & 1) == 0) ? MemoryFactorial.SINGLETON.factorial(n - 1).multiply(Z.ONE.shiftLeft(n).add(n - 1))
      : MemoryFactorial.SINGLETON.factorial(n);
  }
}
