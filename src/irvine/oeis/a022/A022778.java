package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a007.A007337;

/**
 * A022778 Place where <code>n-th 1</code> occurs in <code>A023116</code>.
 * @author Sean A. Irvine
 */
public class A022778 extends A007337 {

  private long mN = 0;
  private Z mM = Z.ZERO;

  @Override
  public Z next() {
    mM = mM.add(1);
    while (!mM.equals(super.next())) {
      ++mN;
    }
    return Z.valueOf(++mN);
  }
}
