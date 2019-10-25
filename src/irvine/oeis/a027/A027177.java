package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027177 <code>T(n,[ n/2 ])</code>, T given by <code>A027170</code>.
 * @author Sean A. Irvine
 */
public class A027177 extends A027170 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(++mN, mN / 2);
  }
}
