package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.oeis.a090.A090076;

/**
 * A022462 <code>a(n) = prime(n)*prime(n+2) mod prime(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A022462 extends A000040 {

  private final A090076 mP = new A090076();
  {
    super.next();
  }

  @Override
  public Z next() {
    return mP.next().mod(super.next());
  }
}
