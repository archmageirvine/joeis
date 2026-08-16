package irvine.oeis.a086;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a005.A005185;

/**
 * A086267 a(n) = 3 + (H(n) mod 6) + floor(r) where H()=A005185() and r = (H(n) - 2*H(n+1) + H(n+2) - 4) / H(n).
 * @author Sean A. Irvine
 */
public class A086267 extends A005185 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mB;
    mB = super.next();
    return new Q(mB.add(t).subtract(mA.multiply2()).subtract(4), t).floor().add(3).add(t.mod(6));
  }
}
