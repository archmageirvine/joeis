package irvine.oeis.a192;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A192222 a(n) = Fibonacci(2^n + 1).
 * @author Georg Fischer
 */
public class A192222 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.FIBONACCI.z((1L << mN) + 1);
  }
}
