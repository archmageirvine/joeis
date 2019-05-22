package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a023.A023121;

/**
 * A022783 Place where <code>n-th 1</code> occurs in <code>A023121</code>.
 * @author Sean A. Irvine
 */
public class A022783 extends A023121 {

  private long mN = 0;

  @Override
  public Z next() {
    while (!Z.ONE.equals(super.next())) {
      ++mN;
    }
    return Z.valueOf(++mN);
  }
}
