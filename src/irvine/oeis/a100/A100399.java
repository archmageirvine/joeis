package irvine.oeis.a100;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A100399 a(n) = Fibonacci(n)^n.
 * @author Georg Fischer
 */
public class A100399 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.FIBONACCI.z((long) mN).pow(mN);
  }
}
