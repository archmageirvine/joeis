package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026617 T(2n,n-1), T given by A026615.
 * @author Sean A. Irvine
 */
public class A026617 extends A026615 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}
