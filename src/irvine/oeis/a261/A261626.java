package irvine.oeis.a261;

import irvine.math.function.Functions;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A261626 a(n) = Fibonacci(n!) - Fibonacci(n)!.
 * @author Georg Fischer
 */
public class A261626 extends Sequence0 {

  private int mN = -1;
  private int mF = 1;

  @Override
  public Z next() {
    ++mN;
    final Z result = Fibonacci.fibonacci(mF)
      .subtract(Functions.FACTORIAL.z(Fibonacci.fibonacci(mN)));
    mF = mF * (mN + 1);
    return result;
  }
}
