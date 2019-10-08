package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026638 <code>T(2n,n)</code>, T given by <code>A026637</code>.
 * @author Sean A. Irvine
 */
public class A026638 extends A026637 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
