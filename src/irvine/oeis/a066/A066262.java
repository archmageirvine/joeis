package irvine.oeis.a066;

import irvine.math.z.Z;

/**
 * A066262 a(n) = gcd(n, A066260(n)).
 * @author Sean A. Irvine
 */
public class A066262 extends A066260 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return super.next().gcd(mN);
  }
}
