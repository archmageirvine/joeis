package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026293 a(n) = T(3n,n), where T is the array in A026268.
 * @author Sean A. Irvine
 */
public class A026293 extends A026268 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(3 * ++mN, mN);
  }
}
