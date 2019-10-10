package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026663 <code>T(2n-1,n-1)</code>, T given by <code>A026659</code>.
 * @author Sean A. Irvine
 */
public class A026663 extends A026659 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 1);
  }
}
