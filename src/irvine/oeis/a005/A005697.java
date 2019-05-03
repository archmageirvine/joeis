package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005697 Positions of remoteness 5 in <code>Beans-Don't-Talk</code>.
 * @author Sean A. Irvine
 */
public class A005697 extends A005694 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (remoteness(++mN) == 5) {
        return Z.valueOf(mN);
      }
    }
  }
}
