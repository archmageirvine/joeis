package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006975.
 * @author Sean A. Irvine
 */
public class A006975 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(mN + 1).multiply(mN + 2).multiply(mN + 3).multiply(mN + 9).divide(15).shiftLeft(mN - 5);
  }
}
