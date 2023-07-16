package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064515 Write A064476(n) = 2^i(n)*3^j(n); sequence gives values of j(n).
 * @author Sean A. Irvine
 */
public class A064515 extends A064476 {

  @Override
  public Z next() {
    Z t = super.next().makeOdd();
    long cnt = -1;
    while (!t.isZero()) {
      ++cnt;
      t = t.divide(3);
    }
    return Z.valueOf(cnt);
  }
}

