package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A083747.
 * @author Sean A. Irvine
 */
public class A083750 extends A000040 {

  private final StringBuilder mS = new StringBuilder();
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mS.length() > 0) {
        mS.append("1111");
      }
      mS.append(super.next());
      if (new Z(mS).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
