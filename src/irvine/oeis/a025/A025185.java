package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025185 a(n) = T(3n,n), where T is the array defined in A025177.
 * @author Sean A. Irvine
 */
public class A025185 extends A025177 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(3 * ++mN, mN);
  }
}
