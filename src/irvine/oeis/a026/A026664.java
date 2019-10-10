package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026664 <code>T(2n-1,n-2)</code>, T given by <code>A026659</code>.
 * @author Sean A. Irvine
 */
public class A026664 extends A026659 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 2);
  }
}
