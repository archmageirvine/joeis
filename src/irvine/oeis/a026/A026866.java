package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026866 <code>T(2n+1,n+2)</code>, T given by <code>A026747</code>.
 * @author Sean A. Irvine
 */
public class A026866 extends A026747 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN + 2);
  }
}
