package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024201 [ (2nd elementary symmetric function of S(n))/(first elementary symmetric function of S(n)) ], where S(n) = {first n+1 odd positive integers}.
 * @author Sean A. Irvine
 */
public class A024201 extends A024196 {

  private long mN = 1;

  @Override
  public Z next() {
    return super.next().divide(++mN).divide(mN);
  }
}

