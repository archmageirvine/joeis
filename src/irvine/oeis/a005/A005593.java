package irvine.oeis.a005;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005593 a(n) = (F(2n+1) + F(2n-1) + F(n+3) - 2)/2, where F() = Fibonacci numbers A000045.
 * @author Sean A. Irvine
 */
public class A005593 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Fibonacci.fibonacci(2 * mN + 1).add(Fibonacci.fibonacci(2 * mN - 1)).add(Fibonacci.fibonacci(mN + 3)).subtract(2).divide2();
  }
}

