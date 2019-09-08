package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025575 <code>a(n) = T(n,[ n/2 ])</code>, where T is the array defined in <code>A025564</code>.
 * @author Sean A. Irvine
 */
public class A025575 extends A025564 {

  private long mN = -2;

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.ONE;
    }
    return get(mN, (mN + 1) / 2);
  }
}
