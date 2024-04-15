package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A062359 a(n) = floor(n!/sigma(n)).
 * @author Sean A. Irvine
 */
public class A062359 extends A000142 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return super.next().divide(Functions.SIGMA.z(mN));
  }
}
