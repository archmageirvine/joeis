package irvine.oeis.a281;

import irvine.math.z.Binomial;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A281450 a(n) = Fibonacci(binomial(2*n,n)).
 * @author Georg Fischer
 */
public class A281450 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Fibonacci.fibonacci(Binomial.binomial(2 * mN, mN).intValue());
  }
}
