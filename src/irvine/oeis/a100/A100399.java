package irvine.oeis.a100;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A100399 a(n) = Fibonacci(n)^n.
 * @author Georg Fischer
 */
public class A100399 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Fibonacci.fibonacci(mN).pow(mN);
  }
}
