package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a023.A023118;

/**
 * A022780 Place where n-th 1 occurs in A023118.
 * @author Sean A. Irvine
 */
public class A022780 extends A023118 {

  private long mN = 0;

  @Override
  public Z next() {
    while (!Z.ONE.equals(super.next())) {
      ++mN;
    }
    return Z.valueOf(++mN);
  }
}
