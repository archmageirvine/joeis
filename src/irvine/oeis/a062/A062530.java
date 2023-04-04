package irvine.oeis.a062;

import irvine.math.z.Z;

/**
 * A062530 Smallest prime p such that there is a gap of 2^n between p and previous prime.
 * @author Sean A. Irvine
 */
public class A062530 extends A062529 {

  @Override
  public Z next() {
    return super.next().add(mN);
  }
}
