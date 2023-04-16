package irvine.oeis.a062;

import irvine.math.z.Z;

/**
 * A062860 Smallest j with n nodes in its riff (rooted index-functional forest).
 * @author Sean A. Irvine
 */
public class A062860 extends A062504 {

  @Override
  public Z next() {
    step();
    while (!mA.a(++mT).equals(mN)) {
      // do nothing
    }
    return Z.valueOf(mT);
  }
}
