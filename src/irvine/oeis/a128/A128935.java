package irvine.oeis.a128;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A128935 a(n) = Fibonacci(5^n) / 5^n.
 * @author Georg Fischer
 */
public class A128935 extends Sequence0 {

  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    final Z result = Functions.FIBONACCI.z(mProd).divide(mProd);
    mProd = mProd.multiply(5);
    return result;
  }
}
