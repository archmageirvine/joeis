package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a002.A002326;

/**
 * A024222 Number of shuffles (perfect faro shuffles with cut) required to return a deck of size n to its original order.
 * @author Sean A. Irvine
 */
public class A024222 extends A002326 {

  /** Construct the sequence. */
  public A024222() {
    super(1);
  }

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    if (mA == null) {
      mA = super.next();
      if (!Z.ONE.equals(mA)) {
        return mA;
      }
    }
    final Z t = mA;
    mA = null;
    return t;
  }
}

