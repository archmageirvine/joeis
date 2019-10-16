package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026867 <code>T(2n+1,n+3)</code>, T given by <code>A026747</code>.
 * @author Sean A. Irvine
 */
public class A026867 extends A026747 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN + 3);
  }
}
