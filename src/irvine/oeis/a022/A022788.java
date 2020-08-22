package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a023.A023126;

/**
 * A022788 Place where n-th 1 occurs in A023126.
 * @author Sean A. Irvine
 */
public class A022788 extends A023126 {

  private long mN = 0;

  @Override
  public Z next() {
    while (!Z.ONE.equals(super.next())) {
      ++mN;
    }
    return Z.valueOf(++mN);
  }
}
