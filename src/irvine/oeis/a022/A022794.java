package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a023.A023132;

/**
 * A022794 Place where <code>n-th 1</code> occurs in <code>A023132</code>.
 * @author Sean A. Irvine
 */
public class A022794 extends A023132 {

  private long mN = 0;

  @Override
  public Z next() {
    while (!Z.ONE.equals(super.next())) {
      ++mN;
    }
    return Z.valueOf(++mN);
  }
}
