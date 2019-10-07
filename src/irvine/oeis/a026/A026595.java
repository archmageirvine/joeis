package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026595 <code>T(n,[ n/2 ])</code>, T given by <code>A026584</code>.
 * @author Sean A. Irvine
 */
public class A026595 extends A026584 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
