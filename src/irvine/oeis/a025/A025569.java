package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025569 <code>T(2n-1,n)</code>, where T is the array defined in <code>A025564</code>.
 * @author Sean A. Irvine
 */
public class A025569 extends A025564 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return get(2 * mN, mN + 1);
  }
}
