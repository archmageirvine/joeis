package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087425 a(n) = S(5*n,5)/S(n,5) where S(n,m) = Sum_{k=0..n} binomial(n,k)*Fibonacci(m*k).
 * @author Sean A. Irvine
 */
public class A087425 extends Sequence1 {

  private long mN = 0;

  private Z s(final long n, final long m) {
    return Integers.SINGLETON.sum(0, n, k -> Functions.BINOMIAL.z(n, k).multiply(Functions.FIBONACCI.z(m * k)));
  }

  @Override
  public Z next() {
    return s(5 * ++mN, 5).divide(s(mN, 5));
  }
}
