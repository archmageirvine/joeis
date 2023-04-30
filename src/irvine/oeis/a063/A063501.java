package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a022.A022008;

/**
 * A063501 Number of prime-sextuplets up to 10^n.
 * @author Sean A. Irvine
 */
public class A063501 extends A022008 {

  private Z mT = Z.ONE;
  private Z mA = super.next().add(16);
  private long mCount = 0;

  @Override
  public Z next() {
    mT = mT.multiply(10);
    while (mA.compareTo(mT) < 0) {
      ++mCount;
      mA = super.next().add(16);
    }
    return Z.valueOf(mCount);
  }
}
