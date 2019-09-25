package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026304 <code>a(n) = T(4n,n)</code>, where T is the array in <code>A026300</code>.
 * @author Sean A. Irvine
 */
public class A026304 extends A026300 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(4 * ++mN, mN);
  }
}
