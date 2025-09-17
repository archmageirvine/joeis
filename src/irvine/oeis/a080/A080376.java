package irvine.oeis.a080;

import irvine.math.z.Z;

/**
 * A003022.
 * @author Sean A. Irvine
 */
public class A080376 extends A080374 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = super.next();
      if (t.compareTo(mA) > 0) {
        mA = t;
        return Z.valueOf(mN);
      }
    }
  }
}
