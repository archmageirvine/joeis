package irvine.oeis.a297;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A297965 a(n) = Fibonacci(binomial(n+3, 3)).
 * @author Georg Fischer
 */
public class A297965 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.FIBONACCI.z(Binomial.binomial(mN + 3, 3));
  }
}
