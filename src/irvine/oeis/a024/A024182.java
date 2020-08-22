package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024182 Integer part of ((4th elementary symmetric function of 2,3,...,n+4)/(3rd elementary symmetric function of 2,3,...,n+4)).
 * @author Sean A. Irvine
 */
public class A024182 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.multiply(15).add(330).multiply(mN).add(2765).multiply(mN).add(10482).multiply(mN).add(15208)
      .multiply(mN)
      .divide(n.add(11).multiply(mN).add(32).multiply(mN + 6).multiply(120));
  }
}
