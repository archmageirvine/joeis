package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a023.A023123;

/**
 * A022785 Place where n-th 1 occurs in A023123.
 * @author Sean A. Irvine
 */
public class A022785 extends A023123 {

  private long mN = 0;

  @Override
  public Z next() {
    while (!Z.ONE.equals(super.next())) {
      ++mN;
    }
    return Z.valueOf(++mN);
  }
}
