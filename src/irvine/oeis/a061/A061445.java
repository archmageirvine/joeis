package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061301.
 * @author Sean A. Irvine
 */
public class A061445 extends A061447 {

  private int mN = 8;

  @Override
  public Z next() {
    while (true) {
      if (lucasStar(++mN).isProbablePrime()) {
        final Z n = Z.valueOf(mN);
        if (!n.isProbablePrime()) {
          return n;
        }
      }
    }
  }
}
