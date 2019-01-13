package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a259.A259708;

/**
 * A006502.
 * @author Sean A. Irvine
 */
public class A006502 extends A259708 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, mN - 2);
  }
}

