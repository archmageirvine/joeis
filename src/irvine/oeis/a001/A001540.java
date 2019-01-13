package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001540.
 * @author Sean A. Irvine
 */
public class A001540 implements Sequence {

  private long mN = 0;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    mA = mA.multiply(mN).add(mN).subtract(mN & 1);
    return mA;
  }
}
