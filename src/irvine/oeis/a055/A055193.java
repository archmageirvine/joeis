package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a009.A009111;

/**
 * A055193 Smallest number that is the area of n distinct Pythagorean triangles.
 * @author Sean A. Irvine
 */
public class A055193 extends A009111 {

  private int mN = 0;
  private Z mA = super.next();

  @Override
  public Z next() {
    ++mN;
    while (true) {
      long cnt = 0;
      Z t;
      do {
        t = mA;
        mA = super.next();
        ++cnt;
      } while (mA.equals(t));
      if (cnt >= mN) {
        return t;
      }
    }
  }
}
