package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050624 Let b(n) = A050623(n) = smallest n-digit number divisible by 3^n; sequence gives b(n)/3^n.
 * @author Sean A. Irvine
 */
public class A050624 extends Sequence1 {

  private Z mT = Z.ONE;
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    mT = mT.multiply(3);
    return mA.add(mT).subtract(1).divide(mT);
  }
}
