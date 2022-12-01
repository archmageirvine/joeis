package irvine.oeis.a210;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A210343 a(n) = Fibonacci(n+1)^n.
 * @author Georg Fischer
 */
public class A210343 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Fibonacci.fibonacci(mN + 1).pow(mN);
  }
}
