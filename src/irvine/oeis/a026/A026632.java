package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026632 <code>T(n,[ n/2 ])</code>, T given by <code>A026626</code>.
 * @author Sean A. Irvine
 */
public class A026632 extends A026626 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
