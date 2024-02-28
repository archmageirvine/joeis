package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068786 S(n; 1,0) = S(n; 3,0) where S(n; t,s) is the number of length n 4-ary strings whose digits sum to t mod 4 and whose sum of products of all pairs of digits sum to s mod 4.
 * @author Sean A. Irvine
 */
public class A068786 extends A068596 {

  private int mN = 0;

  @Override
  public Z next() {
    return s(++mN, 4, 1, 0);
  }
}
