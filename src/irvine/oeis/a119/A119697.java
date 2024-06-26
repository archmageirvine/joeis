package irvine.oeis.a119;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A119697 a(n) = Fibonacci(n)*n*binomial(2*n,n)/(n+1).
 * @author Georg Fischer
 */
public class A119697 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.FIBONACCI.z(mN).multiply(mN).multiply(Binomial.binomial(2L * mN, mN)).divide(mN + 1);
  }
}
