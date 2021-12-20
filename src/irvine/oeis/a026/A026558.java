package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026558 a(n) = T(2*n, n), where T is given by A026552.
 * @author Sean A. Irvine
 */
public class A026558 extends A026552 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
