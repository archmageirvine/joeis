package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026643 <code>T(n,[ n/2 ])</code>, T given by <code>A026637</code>.
 * @author Sean A. Irvine
 */
public class A026643 extends A026637 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
