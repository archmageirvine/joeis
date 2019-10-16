package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026864 <code>T(2n,n+4)</code>, T given by <code>A026747</code>.
 * @author Sean A. Irvine
 */
public class A026864 extends A026747 {

  private long mN = 3;

  @Override
  public Z next() {
    return get(2 * ++mN, mN + 4);
  }
}
