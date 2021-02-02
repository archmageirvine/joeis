package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038735 T(n,n-6), array T as in A038730.
 * @author Sean A. Irvine
 */
public class A038735 extends A038730 {

  private long mN = 6;

  @Override
  public Z next() {
    return t(++mN, mN - 6);
  }
}
