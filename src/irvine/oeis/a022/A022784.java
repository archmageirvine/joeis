package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a023.A023122;

/**
 * A022784 Place where n-th 1 occurs in A023122.
 * @author Sean A. Irvine
 */
public class A022784 extends A023122 {

  private long mN = 0;

  @Override
  public Z next() {
    while (!Z.ONE.equals(super.next())) {
      ++mN;
    }
    return Z.valueOf(++mN);
  }
}
