package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a078.A078142;

/**
 * A071147.
 * @author Sean A. Irvine
 */
public class A071247 extends A078142 {

  private Z mT = super.next();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mT;
      mT = super.next();
      if (t.equals(mT)) {
        return Z.valueOf(mN);
      }
    }
  }
}
