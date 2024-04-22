package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068098 a(n) = Lucas(Fibonacci(n)).
 * @author Georg Fischer
 */
public class A068098 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.LUCAS.z(Functions.FIBONACCI.z((long) mN));
  }
}
