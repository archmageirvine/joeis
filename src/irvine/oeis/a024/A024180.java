package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024180 a(n) = floor(3rd elementary symmetric function of 2,3,...,n+3)/ 2nd elementary symmetric function of (2,3,...,n+3) ).
 * @author Sean A. Irvine
 */
public class A024180 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.add(9).multiply(mN).add(22)
      .multiply(mN + 5).multiply(mN)
      .divide(n.multiply(3).add(29).multiply(mN).add(72).multiply2());
  }
}
