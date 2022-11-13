package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060373 q(n), negative part of n when n=p(n)-q(n) with p(n), q(n), p(n)+q(n) in A005836, integers written without 2 in base 3.
 * @author Sean A. Irvine
 */
public class A060373 extends A060372 {

  @Override
  public Z next() {
    return super.next().subtract(mN);
  }
}
