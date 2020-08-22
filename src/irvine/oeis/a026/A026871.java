package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026871 T(2n,n-3), T given by A026758.
 * @author Sean A. Irvine
 */
public class A026871 extends A026758 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 3);
  }
}
