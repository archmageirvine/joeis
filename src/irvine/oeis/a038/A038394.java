package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A038394 Concatenate first n primes in reverse order.
 * @author Sean A. Irvine
 */
public class A038394 extends A000040 {

  private final StringBuilder mS = new StringBuilder();

  @Override
  public Z next() {
    mS.insert(0, super.next());
    return new Z(mS);
  }
}
