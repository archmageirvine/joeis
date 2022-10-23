package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001525 a(n) = (3n)!/(3!n!).
 * @author Sean A. Irvine
 */
public class A001525 extends Sequence1 {

  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    final long u = 3 * mN;
    mF = mF.multiply(u).multiply(u - 1).multiply(u - 2).divide(mN);
    return mF.divide(6);
  }
}
