package irvine.oeis.a082;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A082005 Sum of n-th antidiagonal of array in A082002.
 * @author Sean A. Irvine
 */
public class A082005 extends A082002 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
