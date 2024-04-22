package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063374 a(n) = Fibonacci(n!).
 * @author Georg Fischer
 */
public class A063374 extends Sequence0 {

  private int mN = 0;
  private int mF = 1;

  @Override
  public Z next() {
    ++mN;
    final Z result = Functions.FIBONACCI.z((long) mF);
    mF *= mN;
    return result;
  }
}
