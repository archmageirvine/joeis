package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070964 a(n) = Sum_{1&lt;=k&lt;=n, gcd(k,n)=1} Fibonacci(k).
 * @author Sean A. Irvine
 */
public class A070964 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      if (Functions.GCD.l(k, mN) == 1) {
        sum = sum.add(Functions.FIBONACCI.z(k));
      }
    }
    return sum;
  }
}
