package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a007.A007337;

/**
 * A022777 Place where <code>n-th 1</code> occurs in <code>A007337</code>.
 * @author Sean A. Irvine
 */
public class A022777 extends A007337 {

  private long mN = 0;

  @Override
  public Z next() {
    while (!Z.ONE.equals(super.next())) {
      ++mN;
    }
    return Z.valueOf(++mN);
  }
}
