package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050623 Smallest n-digit number divisible by 3^n.
 * @author Sean A. Irvine
 */
public class A050623 extends Sequence1 {

  private Z mT = Z.ONE;
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    mT = mT.multiply(3);
    return mA.add(mT).subtract(1).divide(mT).multiply(mT);
  }
}
