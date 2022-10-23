package irvine.oeis.a051;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051294 a(n) = F(n^2)/F(n), where F(n) = A000045(n) is the n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A051294 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Fibonacci.fibonacci(++mN * mN).divide(Fibonacci.fibonacci(mN));
  }
}
