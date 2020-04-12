package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A031134 Upper prime of a record difference between it and the second prime before it.
 * @author Sean A. Irvine
 */
public class A031134 extends A000040 {

  private Z mA = super.next();
  private Z mB = super.next();
  private Z mBest = Z.ZERO;

  @Override
  public Z next() {
    Z delta;
    Z t;
    do {
     t = mA;
      mA = mB;
      mB = super.next();
      delta = mB.subtract(t);
    } while (delta.compareTo(mBest) <= 0);
    mBest = delta;
    return mB;
  }
}

