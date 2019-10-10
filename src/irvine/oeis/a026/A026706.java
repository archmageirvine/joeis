package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026706 <code>T(2n,n-2)</code>, T given by <code>A026703</code>.
 * @author Sean A. Irvine
 */
public class A026706 extends A026703 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 2);
  }
}
