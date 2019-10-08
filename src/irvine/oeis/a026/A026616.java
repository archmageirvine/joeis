package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026616 <code>T(2n,n)</code>, T given by <code>A026615</code>.
 * @author Sean A. Irvine
 */
public class A026616 extends A026615 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
