package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026718 <code>T(2n-1,n-1)</code>, T given by <code>A026714</code>.
 * @author Sean A. Irvine
 */
public class A026718 extends A026714 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 1);
  }
}
