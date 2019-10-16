package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026860 <code>T(2n,n-3)</code>, T given by <code>A026747</code>.
 * @author Sean A. Irvine
 */
public class A026860 extends A026747 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 3);
  }
}
