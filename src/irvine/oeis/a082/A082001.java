package irvine.oeis.a082;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a081.A081998;

/**
 * A082001 Sum of n-th antidiagonal of array in A081998.
 * @author Sean A. Irvine
 */
public class A082001 extends A081998 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
