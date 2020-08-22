package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026887 T(2n+1,n+1), T given by A026769.
 * @author Sean A. Irvine
 */
public class A026887 extends A026769 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN + 1);
  }
}
