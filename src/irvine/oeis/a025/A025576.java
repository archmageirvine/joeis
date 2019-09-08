package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025576 <code>a(n) = T(n,[ n/2 ]+1)</code>, where T is the array defined in <code>A025564</code>.
 * @author Sean A. Irvine
 */
public class A025576 extends A025564 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, (mN + 1) / 2 + 1);
  }
}
