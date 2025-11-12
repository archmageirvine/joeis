package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A390398 allocated for Noah A Rosenberg.
 * @author Sean A. Irvine
 */
public class A390398 extends Sequence2 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FOUR : mA.multiply(mA.subtract(1)).divide2().add(2);
    return mA;
  }
}
