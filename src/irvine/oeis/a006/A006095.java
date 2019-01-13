package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006095.
 * @author Sean A. Irvine
 */
public class A006095 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).subtract(1).multiply(Z.ONE.shiftLeft(mN - 1).subtract(1)).divide(3);
  }
}

