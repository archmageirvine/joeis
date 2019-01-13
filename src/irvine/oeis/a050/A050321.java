package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a004.A004396;

/**
 * A050321.
 * @author Sean A. Irvine
 */
public class A050321 extends A050292 {

  private final A004396 mA = new A004396();
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      final Z a = mA.next();
      final Z b = super.next();
      mN = mN.add(1);
      if (!a.equals(b)) {
        return mN;
      }
    }
  }
}
