package irvine.oeis.a027;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027994 a(n) = (F(2n+3) - F(n))/2 where F() = Fibonacci numbers A000045.
 * @author Sean A. Irvine
 */
public class A027994 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Fibonacci.fibonacci(2 * ++mN + 3).subtract(Fibonacci.fibonacci(mN)).divide2();
  }
}
