package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a007.A007629;

/**
 * A072533 Least Keith number (or repfigit) with n digits, or 0 if there is none.
 * @author Sean A. Irvine
 */
public class A072533 extends Sequence2 {

  private final Sequence mKeith = new A007629();
  private Z mA = mKeith.next();
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(10);
    while (mA.compareTo(mT) < 0) {
      mA = mKeith.next();
    }
    return mA.compareTo(mT.multiply(10)) >= 0 ? Z.ZERO : mA;
  }
}
