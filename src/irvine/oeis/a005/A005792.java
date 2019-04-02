package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a001.A001481;

/**
 * A005792 Positive numbers that are the sum of 2 squares or 3 times a square.
 * @author Sean A. Irvine
 */
public class A005792 extends A001481 {

  {
    super.next(); // skip 0
  }
  private long mS = 1;
  private Z mV = Z.THREE;
  private Z mU = super.next();

  @Override
  public Z next() {
    if (mV.compareTo(mU) <= 0) {
      if (mV.equals(mU)) {
        mU = super.next();
      }
      final Z r = mV;
      mV = Z.valueOf(++mS).square().multiply(3);
      return r;
    } else {
      final Z r = mU;
      mU = super.next();
      return r;
    }
  }
}
