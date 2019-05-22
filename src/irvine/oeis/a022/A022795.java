package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a023.A023133;

/**
 * A022795 Place where <code>n-th 1</code> occurs in <code>A023133</code>.
 * @author Sean A. Irvine
 */
public class A022795 extends A023133 {

  private long mN = 0;

  @Override
  public Z next() {
    while (!Z.ONE.equals(super.next())) {
      ++mN;
    }
    return Z.valueOf(++mN);
  }
}
