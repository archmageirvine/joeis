package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075574 a(1) = 1, then the smallest number (obviously even) greater than the previous term such that every partial sum is prime.
 * @author Sean A. Irvine
 */
public class A075574 extends Sequence1 {

  private Z mA = null;
  private Z mSum = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return Z.ONE;
    }
    while (true) {
      mA = mA.add(2);
      final Z s = mSum.add(mA);
      if (s.isProbablePrime()) {
        mSum = s;
        return mA;
      }
    }
  }
}

