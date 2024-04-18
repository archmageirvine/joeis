package irvine.oeis.a065;
// manually knest/eulphi at 2023-03-01 16:41

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A065449 a(n) = phi(Fibonacci(n)).
 * @author Georg Fischer
 */
public class A065449 extends A000045 {

  private int mN = -1;

  {
    super.next();
  }

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ZERO : Functions.PHI.z(super.next());
  }
}
