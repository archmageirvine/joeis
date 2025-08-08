package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a000.A000594;

/**
 * A385318.
 * @author Sean A. Irvine
 */
public class A079334 extends A000594 {

  private Z mA = super.next();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (t.mod(mN) == 0 && mA.mod(mN + 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
