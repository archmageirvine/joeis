package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026619 <code>T(2n-1,n-1)</code>, T given by <code>A026615</code>.
 * @author Sean A. Irvine
 */
public class A026619 extends A026615 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 1);
  }
}
