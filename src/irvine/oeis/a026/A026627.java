package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026627 <code>T(2n,n)</code>, T given by <code>A026626</code>.
 * @author Sean A. Irvine
 */
public class A026627 extends A026626 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
