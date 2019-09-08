package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025574 <code>T(2n,n+1)</code>, where T is the array defined in <code>A025564</code>.
 * @author Sean A. Irvine
 */
public class A025574 extends A025564 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return get(2 * mN + 1, mN + 2);
  }
}
