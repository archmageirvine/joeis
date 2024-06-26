package irvine.oeis.a225;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A225686 a(n) = Fibonacci(2*n^2), a "Somos-like" sequence.
 * @author Georg Fischer
 */
public class A225686 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Functions.FIBONACCI.z(2L * mN * mN);
  }
}
