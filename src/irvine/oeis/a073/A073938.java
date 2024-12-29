package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a078.A078142;

/**
 * A073929.
 * @author Sean A. Irvine
 */
public class A073938 extends A078142 {

  private Z mA = super.next();
  private Z mB = super.next();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = mB;
      mB = super.next();
      if (mB.equals(t) && mA.equals(mB)) {
        return Z.valueOf(mN);
      }
    }
  }
}

