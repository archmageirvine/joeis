package irvine.oeis.a102;

import irvine.math.z.Binomial;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A102307 a(n) = Fibonacci(2n+1) * binomial(2n,n).
 * @author Georg Fischer
 */
public class A102307 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Fibonacci.fibonacci(2 * mN + 1).multiply(Binomial.binomial(2L * mN, mN));
  }
}
