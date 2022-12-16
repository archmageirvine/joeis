package irvine.oeis.a250;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A250495 The n^n-th Fibonacci number.
 * @author Georg Fischer
 */
public class A250495 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Fibonacci.fibonacci(Z.valueOf(mN).pow(mN).intValueExact());
  }
}
