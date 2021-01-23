package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026879 T(2n+1,n+4), T given by A026758.
 * @author Sean A. Irvine
 */
public class A026879 extends A026758 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN + 4);
  }
}
