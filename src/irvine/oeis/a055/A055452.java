package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055452 T(n,n-2), array T as in A055450.
 * @author Sean A. Irvine
 */
public class A055452 extends A055450 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN + 2, mN);
  }
}
