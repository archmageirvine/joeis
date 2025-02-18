package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a002.A002034;

/**
 * A070428.
 * @author Sean A. Irvine
 */
public class A075396 extends A002034 {

  private Z mA = super.next();
  private Z mB = super.next();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = super.next();
      ++mN;
      if (mA.compareTo(t) < 0 && mA.compareTo(mB) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
