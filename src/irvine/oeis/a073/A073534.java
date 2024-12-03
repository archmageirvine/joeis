package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a002.A002034;

/**
 * A073500.
 * @author Sean A. Irvine
 */
public class A073534 extends A002034 {

  private long mN = 0;
  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = mB;
      mB = super.next();
      if (t.add(2).equals(mB)) {
        return Z.valueOf(mN);
      }
    }
  }
}
