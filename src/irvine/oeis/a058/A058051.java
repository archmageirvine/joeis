package irvine.oeis.a058;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058051 a(n) = F(F(F(n))), where F is a Fibonacci number (A000045).
 * @author Sean A. Irvine
 */
public class A058051 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Functions.FIBONACCI.z(Functions.FIBONACCI.z(Functions.FIBONACCI.z(++mN)));
  }
}
