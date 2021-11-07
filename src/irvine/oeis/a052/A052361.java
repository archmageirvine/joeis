package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a088.A088042;

/**
 * A052361 Number of permutations in the symmetric group S_n such that the size of their conjugacy class is even.
 * @author Sean A. Irvine
 */
public class A052361 extends A088042 {

  @Override
  public Z next() {
    final Z t = super.next();
    return mF.factorial(mN).subtract(t);
  }
}
