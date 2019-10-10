package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026694 <code>T(2n,n-1)</code>, T given by <code>A026692</code>.
 * @author Sean A. Irvine
 */
public class A026694 extends A026692 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}
