package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005696 Positions of remoteness 4 in Beans-Don't-Talk.
 * @author Sean A. Irvine
 */
public class A005696 extends A005694 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (remoteness(++mN) == 4) {
        return Z.valueOf(mN);
      }
    }
  }
}
