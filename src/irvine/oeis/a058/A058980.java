package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058980 Positive numbers of form 4k such that card(invphi(4*k)=0) (the nontotients congruent to 0 modulo 4).
 * @author Sean A. Irvine
 */
public class A058980 extends A058979 {

  @Override
  public Z next() {
    while (!super.next().isZero()) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
