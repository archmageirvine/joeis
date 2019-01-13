package irvine.oeis.a122;

import irvine.math.z.Z;
import irvine.oeis.a000.A000085;

/**
 * A122748.
 * @author Sean A. Irvine
 */
public class A122748 extends A000085 {

  private Z mF = Z.ONE;
  private long mN = -1;
  private Z mP = super.next();

  @Override
  public Z next() {
    ++mN;
    final long k = mN / 2;
    if ((mN & 1) == 0) {
      if ((k & 1) == 0) {
        if (k > 1) {
          mF = mF.multiply(k).multiply(k - 1);
        }
        return mF.multiply(k + 2).divide2();
      } else {
        return mF.multiply(k + 1).multiply(k + 1).divide2();
      }
    } else {
      final Z t = mP;
      mP = super.next();
      return mP.multiply(t);
    }
  }
}
