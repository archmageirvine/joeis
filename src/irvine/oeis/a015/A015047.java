package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.a002.A002034;

/**
 * A015047.
 * @author Sean A. Irvine
 */
public class A015047 extends A002034 {

  private Z mA = super.next();
  private Z mB = super.next();
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = mB;
      mB = super.next();
      if (t.add(mA).equals(mB)) {
        return Z.valueOf(mN);
      }
    }
  }
}
