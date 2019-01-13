package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008464.
 * @author Sean A. Irvine
 */
public class A008464 implements Sequence {

  private int mN = -2;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(2 * mN + 3).subtract(Z.valueOf(mN + 3).shiftLeft(mN));
  }
}
