package irvine.oeis.a067;

import irvine.math.z.Z;

/**
 * A067229.
 * @author Sean A. Irvine
 */
public class A067396 extends A067395 {

  private long mN = 0;
  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z a = mA;
      mA = super.next();
      if (Z.TWO.equals(a) && Z.TWO.equals(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}
