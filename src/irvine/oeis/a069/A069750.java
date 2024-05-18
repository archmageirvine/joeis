package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069743.
 * @author Sean A. Irvine
 */
public class A069750 extends Sequence1 {

  private Z mA = null;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mT = mT.multiply(10);
      Z t = mT.divide(mA);
      while (mT.divide(t).compareTo(mA) <= 0) {
        t = t.subtract(1);
      }
      mA = t.add(1);
    }
    return mA;
  }
}
