package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025572 a(n) = T(4n,n), where T is the array defined in A025564.
 * @author Sean A. Irvine
 */
public class A025572 extends A025564 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return get(4 * mN - 1, mN);
  }
}
