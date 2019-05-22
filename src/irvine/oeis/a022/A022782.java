package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a023.A023120;

/**
 * A022782 Place where <code>n-th 1</code> occurs in <code>A023120</code>.
 * @author Sean A. Irvine
 */
public class A022782 extends A023120 {

  private long mN = 0;

  @Override
  public Z next() {
    while (!Z.ONE.equals(super.next())) {
      ++mN;
    }
    return Z.valueOf(++mN);
  }
}
