package irvine.oeis.a079;

import irvine.math.z.Z;

/**
 * A079106 Number of permutations of length n containing the minimum number of monotone subsequences of length 5.
 * @author Sean A. Irvine
 */
public class A079106 extends A079104 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 5);
  }
}

