package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027161 T(2n-1,n-1), T given by A027157.
 * @author Sean A. Irvine
 */
public class A027161 extends A027157 {

  private long mN = 0;

  @Override
  public Z next() {
    return t(2 * ++mN - 1, mN - 1);
  }
}
