package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a023.A023128;

/**
 * A022790 Place where n-th 1 occurs in A023128.
 * @author Sean A. Irvine
 */
public class A022790 extends A023128 {

  private long mN = 0;

  @Override
  public Z next() {
    while (!Z.ONE.equals(super.next())) {
      ++mN;
    }
    return Z.valueOf(++mN);
  }
}
