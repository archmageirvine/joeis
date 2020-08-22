package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024202 a(n) = [ (3rd elementary symmetric function of S(n))/(first elementary symmetric function of S(n)) ], where S(n) = {first n+2 odd positive integers}.
 * @author Sean A. Irvine
 */
public class A024202 extends A024197 {

  private long mN = 2;

  @Override
  public Z next() {
    return super.next().divide(++mN).divide(mN);
  }
}

