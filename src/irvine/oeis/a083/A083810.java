package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083810 a(n) = f^(n) (n), where f(n) is the smallest prime == 1 mod n (cf. A034694).
 * @author Sean A. Irvine
 */
public class A083810 extends A083809 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k < mN; ++k) {
      super.next();
    }
    return super.next();
  }
}
