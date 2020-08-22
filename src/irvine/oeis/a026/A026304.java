package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026304 a(n) = T(4n,n), where T is the array in A026300.
 * @author Sean A. Irvine
 */
public class A026304 extends A026300 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(4 * ++mN, mN);
  }
}
