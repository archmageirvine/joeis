package irvine.oeis.a273;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A273397 a(n) = Fibonacci(Catalan(n)).
 * @author Georg Fischer
 */
public class A273397 extends A000108 {

  @Override
  public Z next() {
    return Functions.FIBONACCI.z(super.next());
  }
}
