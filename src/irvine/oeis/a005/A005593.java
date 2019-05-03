package irvine.oeis.a005;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005593 <code>a(n) = (F(2n+1) + F(2n-1) + F(n+3) - 2)/2</code>, where <code>F() =</code> Fibonacci numbers <code>A000045</code>.
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

