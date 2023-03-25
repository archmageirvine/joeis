package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a060.A060324;

/**
 * A062251 Take minimal prime q such that n(q+1)-1 is prime (A060324), that is, the smallest prime q so that n = (p+1)/(q+1) with p prime; sequence gives values of p.
 * @author Sean A. Irvine
 */
public class A062251 extends A060324 {

  @Override
  public Z next() {
    return super.next().add(1).multiply(mN).subtract(1);
  }
}
