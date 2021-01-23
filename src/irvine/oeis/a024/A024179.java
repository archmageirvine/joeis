package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024179 Integer part of ((4th elementary symmetric function of 2,3,...,n+4)/(2+3+...+n+4)).
 * @author Sean A. Irvine
 */
public class A024179 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(15).add(330).multiply(mN).add(2765).multiply(mN).add(10482).multiply(mN).add(15208)
      .multiply(mN).multiply(mN + 1).multiply(mN + 2).divide(mN + 6).divide(2880);
  }
}
