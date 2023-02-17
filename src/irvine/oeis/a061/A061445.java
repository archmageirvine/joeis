package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061445 Composite numbers n such that primitive part of Lucas(n) (see A061447) is prime.
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
