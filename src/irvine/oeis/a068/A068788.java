package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068788 S(n; 1,3) = S(n; 3,3) where S(n; t,s) is the number of length n 4-ary strings whose digits sum to t mod 4 and whose sum of products of all pairs of digits sum to s mod 4.
 * @author Sean A. Irvine
 */
public class A068788 extends A068620 {

  private int mN = 0;

  @Override
  public Z next() {
    return mS.get(++mN, 1, 3);
  }
}
