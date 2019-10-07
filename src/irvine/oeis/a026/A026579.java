package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026579 <code>T(n,[ n/2 ])</code>, T given by <code>A026568</code>.
 * @author Sean A. Irvine
 */
public class A026579 extends A026568 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
