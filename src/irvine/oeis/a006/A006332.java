package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006332 From the enumeration of corners.
 * @author Sean A. Irvine
 */
public class A006332 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(2 * mN + 3).multiply(mN).multiply(mN + 1).multiply(mN + 1).multiply(mN + 2).multiply(2 * mN + 1).divide(90);
  }
}
