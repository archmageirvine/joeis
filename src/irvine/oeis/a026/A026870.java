package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026870 <code>T(2n,n-4)</code>, T given by <code>A026758</code>.
 * @author Sean A. Irvine
 */
public class A026870 extends A026758 {

  private long mN = 3;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 4);
  }
}
