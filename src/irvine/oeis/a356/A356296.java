package irvine.oeis.a356;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A356296 a(n) = Fibonacci(n)^2 mod n.
 * @author Georg Fischer
 */
public class A356296 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Functions.FIBONACCI.z(mN).square().mod(Z.valueOf(mN));
  }
}
