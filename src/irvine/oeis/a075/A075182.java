package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075169.
 * @author Sean A. Irvine
 */
public class A075182 extends A075181 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z gcd = super.next();
    for (int k = 1; k < mN; ++k) {
      gcd = gcd.gcd(super.next());
    }
    return gcd;
  }
}
