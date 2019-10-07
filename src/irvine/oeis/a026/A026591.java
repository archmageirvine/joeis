package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026591 <code>T(2n,n-1)</code>, T given by <code>A026584</code>.
 * @author Sean A. Irvine
 */
public class A026591 extends A026584 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}
