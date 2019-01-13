package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a006.A006862;

/**
 * A014545.
 * @author Sean A. Irvine
 */
public class A014545 extends A006862 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
