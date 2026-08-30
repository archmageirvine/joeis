package irvine.oeis.a086;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A086382 k divides F(k*n^2+1)-F(k+1) for 1&lt;=k&lt;=a(n) where F(k) is the k-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A086382 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long m = 1;
    while (Fibonacci.fibonacci(m * mN * mN + 1, m) - Fibonacci.fibonacci(m + 1, m) == 0) {
      ++m;
    }
    return Z.valueOf(m - 1);
  }
}

