package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026590 <code>T(2n,n)</code>, T given by <code>A026584</code>.
 * @author Sean A. Irvine
 */
public class A026590 extends A026584 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
