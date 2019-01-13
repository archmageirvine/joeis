package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002453.
 * @author Sean A. Irvine
 */
public class A002453 implements Sequence {

  private Z mNines = null;
  private Z mP25 = Z.valueOf(625);

  @Override
  public Z next() {
    if (mNines == null) {
      mNines = Z.valueOf(243);
    } else {
      mNines = mNines.multiply(9);
      mP25 = mP25.multiply(25);
    }
    return mP25.subtract(mNines).add(2).divide(384);
  }
}
