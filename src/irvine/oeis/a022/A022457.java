package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A022457 a(n) = prime(2n) mod prime(n).
 * @author Sean A. Irvine
 */
public class A022457 extends A000040 {

  private final A000040 mP = new A000040();

  @Override
  public Z next() {
    mP.next();
    return mP.next().mod(super.next());
  }
}
