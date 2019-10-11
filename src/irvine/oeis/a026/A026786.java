package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026786 <code>T(n,[ n/2 ])</code>, T given by <code>A026780</code>.
 * @author Sean A. Irvine
 */
public class A026786 extends A026780 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
