package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026899 <code>T(2n+1,n+2)</code>, T given by <code>A026780</code>.
 * @author Sean A. Irvine
 */
public class A026899 extends A026780 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN + 2);
  }
}
