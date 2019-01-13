package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a079.A079502;

/**
 * A006329.
 * @author Sean A. Irvine
 */
public class A006329 extends A079502 {

  private int mN = 3;

  @Override
  public Z next() {
    return u(++mN, mN - 2);
  }
}

