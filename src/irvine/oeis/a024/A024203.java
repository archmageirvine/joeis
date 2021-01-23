package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024203 [ (4th elementary symmetric function of S(n))/(first elementary symmetric function of S(n)) ], where S(n) = {first n+3 odd positive integers}.
 * @author Sean A. Irvine
 */
public class A024203 extends A024198 {

  private long mN = 3;

  @Override
  public Z next() {
    return super.next().divide(++mN).divide(mN);
  }
}

