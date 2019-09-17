package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026132.
 * @author Sean A. Irvine
 */
public class A026132 extends A026120 {

  private long mN = 0;

  @Override
  public Z next() {
    return u(2 * ++mN, mN);
  }
}
