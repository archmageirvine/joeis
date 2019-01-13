package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006333.
 * @author Sean A. Irvine
 */
public class A006333 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(2 * mN + 5).multiply(2 * mN + 3).multiply(2 * mN + 1)
      .multiply(mN).multiply(mN + 1).multiply(mN + 1).multiply(mN + 2).multiply(mN + 2).multiply(mN + 3)
      .divide(7560);
  }
}

