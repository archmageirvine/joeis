package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a023.A023119;

/**
 * A022781 Place where n-th 1 occurs in A023119.
 * @author Sean A. Irvine
 */
public class A022781 extends A023119 {

  private long mN = 0;

  @Override
  public Z next() {
    while (!Z.ONE.equals(super.next())) {
      ++mN;
    }
    return Z.valueOf(++mN);
  }
}
