package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A062007 a(n) = mu(n)*prime(n).
 * @author Sean A. Irvine
 */
public class A062007 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().multiply(Functions.MOBIUS.i(++mN));
  }
}
