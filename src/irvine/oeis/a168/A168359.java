package irvine.oeis.a168;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A168359 a(n) = Fibonacci(n!)!.
 * @author Georg Fischer
 */
public class A168359 extends Sequence0 {

  private int mN = 0;
  private int mF = 1;

  @Override
  public Z next() {
    ++mN;
    final Z result = Functions.FACTORIAL.z(Functions.FIBONACCI.z((long) mF));
    mF *= mN;
    return result;
  }
}
