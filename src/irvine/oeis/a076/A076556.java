package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A076556 Greatest prime divisor of n-th prime + n.
 * @author Sean A. Irvine
 */
public class A076556 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.GPF.z(super.next().add(++mN));
  }
}
