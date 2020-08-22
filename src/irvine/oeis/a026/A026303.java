package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026303 a(n) = T(3n,n), where T is the array in A026300.
 * @author Sean A. Irvine
 */
public class A026303 extends A026300 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(3 * ++mN, mN);
  }
}
