package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a007.A007770;

/**
 * A035503 Upper of pair of consecutive happy numbers.
 * @author Sean A. Irvine
 */
public class A035503 extends A007770 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (t.add(1).equals(mA)) {
        return mA;
      }
    }
  }
}

