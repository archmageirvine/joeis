package irvine.oeis.a005;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005370 <code>a(n) =</code> Fibonacci(Fibonacci(n+1)+1).
 * @author Sean A. Irvine
 */
public class A005370 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Fibonacci.fibonacci(Fibonacci.fibonacci(++mN).intValueExact() + 1);
  }
}
