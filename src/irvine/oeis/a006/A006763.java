package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a001.A001168;
import irvine.oeis.a001.A001931;

/**
 * A006763 Number of fixed properly-3-dimensional polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A006763 extends A001931 {

  private final A001168 mA = new A001168();

  @Override
  public Z next() {
    return super.next().subtract(Z.ONE.max(mA.next().subtract(1).multiply(3)));
  }
}
