package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026698 <code>T(n,[ n/2 ])</code>, T given by <code>A026692</code>.
 * @author Sean A. Irvine
 */
public class A026698 extends A026692 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
