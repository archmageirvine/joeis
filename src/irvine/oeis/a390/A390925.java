package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390925 allocated for Robert P. P. McKone.
 * @author Sean A. Irvine
 */
public class A390925 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(8141)
      .subtract(14637).multiply(mN)
      .subtract(11887).multiply(mN)
      .add(12765).multiply(mN)
      .add(8750).multiply(mN)
      .subtract(540).multiply(mN)
      .add(144)
      .multiply(mN).multiply(mN - 1).multiply(mN - 2)
      .divide(45360);
  }
}

