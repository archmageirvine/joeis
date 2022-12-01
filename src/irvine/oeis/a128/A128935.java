package irvine.oeis.a128;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A128935 a(n) = Fibonacci(5^n) / 5^n.
 * @author Georg Fischer
 */
public class A128935 extends Sequence0 {

  private int mBase = 5;
  private int mProd = 1;

  @Override
  public Z next() {
    final Z result = Fibonacci.fibonacci(mProd).divide(mProd);
    mProd *= mBase;
    return result;
  }
}
