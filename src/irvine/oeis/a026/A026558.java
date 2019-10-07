package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026558 <code>T(2n,n)</code>, T given by <code>A026552</code>.
 * @author Sean A. Irvine
 */
public class A026558 extends A026552 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
