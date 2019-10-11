package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026764 <code>T(n,[ n/2 ])</code>, T given by <code>A026758</code>.
 * @author Sean A. Irvine
 */
public class A026764 extends A026758 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
