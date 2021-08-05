package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;
import irvine.oeis.a090.A090076;

/**
 * A022462 a(n) = prime(n)*prime(n+2) mod prime(n+1).
 * @author Sean A. Irvine
 */
public class A022462 extends A065091 {

  private final A090076 mP = new A090076();

  @Override
  public Z next() {
    return mP.next().mod(super.next());
  }
}
