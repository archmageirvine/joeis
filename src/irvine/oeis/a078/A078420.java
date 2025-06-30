package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a006.A006577;

/**
 * A078396.
 * @author Sean A. Irvine
 */
public class A078420 extends A006577 {

  private long mN = 1;
  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (t.multiply(3).add(2).equals(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}

