package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a023.A023125;

/**
 * A022787 Place where n-th 1 occurs in A023125.
 * @author Sean A. Irvine
 */
public class A022787 extends A023125 {

  private long mN = 0;

  @Override
  public Z next() {
    while (!Z.ONE.equals(super.next())) {
      ++mN;
    }
    return Z.valueOf(++mN);
  }
}
