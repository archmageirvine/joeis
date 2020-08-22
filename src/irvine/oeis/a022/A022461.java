package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.oeis.a006.A006094;

/**
 * A022461 a(n) = prime(n+1)*prime(n+2) mod prime(n).
 * @author Sean A. Irvine
 */
public class A022461 extends A000040 {

  private final A006094 mP = new A006094();
  {
    mP.next();
  }

  @Override
  public Z next() {
    return mP.next().mod(super.next());
  }
}
