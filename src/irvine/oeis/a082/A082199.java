package irvine.oeis.a082;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A082199 Sum of n-th row of triangle in A082196.
 * @author Sean A. Irvine
 */
public class A082199 extends A082196 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
