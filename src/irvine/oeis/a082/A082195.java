package irvine.oeis.a082;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A082195 Sum of n-th antidiagonal of A082191.
 * @author Sean A. Irvine
 */
public class A082195 extends A082191 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
