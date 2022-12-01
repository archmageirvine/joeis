package irvine.oeis.a247;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A247338 a(n) = Lucas(n) concatenated with Fibonacci(n).
 * @author Georg Fischer
 */
public class A247338 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return new Z(Fibonacci.fibonacci(mN).toString() + Fibonacci.lucas(mN).toString());
  }
}
