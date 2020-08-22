package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a023.A023117;

/**
 * A022779 Place where n-th 1 occurs in A023117.
 * @author Sean A. Irvine
 */
public class A022779 extends A023117 {

  private long mN = 0;

  @Override
  public Z next() {
    while (!Z.ONE.equals(super.next())) {
      ++mN;
    }
    return Z.valueOf(++mN);
  }
}
