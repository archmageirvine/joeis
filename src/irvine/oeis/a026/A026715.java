package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026715 <code>T(2n,n)</code>, T given by <code>A026714</code>.
 * @author Sean A. Irvine
 */
public class A026715 extends A026714 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
