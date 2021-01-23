package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026577 T(2n-1,n-1), T given by A026568.
 * @author Sean A. Irvine
 */
public class A026577 extends A026568 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 1);
  }
}
