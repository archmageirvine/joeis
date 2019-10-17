package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026912 <code>T(2n-1,n-1)</code>, T given by <code>A026907</code>.
 * @author Sean A. Irvine
 */
public class A026912 extends A026907 {

  private long mN = 0;

  @Override
  public Z next() {
    return t(2 * ++mN - 1, mN - 1);
  }
}
