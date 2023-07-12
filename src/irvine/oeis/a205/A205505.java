package irvine.oeis.a205;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A205505 Fibonacci(n*(n+1)) / Fibonacci(n).
 * @author Georg Fischer
 */
public class A205505 extends A000045 {

  private int mN = 0;

  {
    setOffset(0);
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    return Fibonacci.fibonacci(mN * (mN + 1)).divide(super.next());
  }
}
