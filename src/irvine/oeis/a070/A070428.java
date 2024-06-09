package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001597;

/**
 * A070287.
 * @author Sean A. Irvine
 */
public class A070428 extends Sequence0 {

  private final Sequence mA = new A001597();
  private Z mT = mA.next();
  private Z mN = null;
  private long mCount = 0;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(10);
    while (mT.compareTo(mN) <= 0) {
      ++mCount;
      mT = mA.next();
    }
    return Z.valueOf(mCount);
  }
}
