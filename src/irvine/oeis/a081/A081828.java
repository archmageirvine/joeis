package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.a005.A005185;

/**
 * A081828 Numbers n such that 2 successive terms of Hofstadter Q-sequence are the same.
 * @author Sean A. Irvine
 */
public class A081828 extends A005185 {

  private Z mA = super.next();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (t.equals(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}
