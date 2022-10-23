package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024181 Integer part of ((4th elementary symmetric function of 2,3,...,n+4)/(2nd elementary symmetric function of 2,3,...,n+4)).
 * @author Sean A. Irvine
 */
public class A024181 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.multiply(15).add(330).multiply(mN).add(2765).multiply(mN).add(10482).multiply(mN).add(15208)
      .multiply(mN + 1).multiply(mN)
      .divide(n.multiply(3).add(35).multiply(mN).add(104).multiply(240));
  }
}

