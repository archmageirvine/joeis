package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001597;

/**
 * A075308 Number of n-digit perfect powers.
 * @author Sean A. Irvine
 */
public class A075308 extends Sequence1 {

  private final Sequence mA = new A001597();
  private Z mT = mA.next();
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.multiply(10);
    long cnt = 0;
    while (mT.compareTo(mN) < 0) {
      ++cnt;
      mT = mA.next();
    }
    return Z.valueOf(cnt);
  }
}
