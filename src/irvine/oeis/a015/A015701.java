package irvine.oeis.a015;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A015701 From iteration of the Galton-Watson branching process.
 * @author Sean A. Irvine
 */
public class A015701 extends Sequence0 {

  private Q mA = null;
  private Z mShift = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    mA = mA == null ? new Q(3, 2) : mA.square().add(1).divide(2);
    mShift = mShift.shiftLeft(1L << ++mN);
    return mA.multiply(mShift).toZ();
  }
}
