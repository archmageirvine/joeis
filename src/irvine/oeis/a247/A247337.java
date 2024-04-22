package irvine.oeis.a247;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A247337 a(n) = Lucas(n) concatenated with Fibonacci(n).
 * @author Georg Fischer
 */
public class A247337 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return new Z(Functions.LUCAS.z((long) mN).toString() + Functions.FIBONACCI.z((long) mN).toString());
  }
}
