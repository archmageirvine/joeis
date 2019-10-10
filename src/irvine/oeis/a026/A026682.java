package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026682 <code>T(2n,n)</code>, T given by <code>A026681</code>.
 * @author Sean A. Irvine
 */
public class A026682 extends A026681 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
