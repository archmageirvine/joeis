package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073924 Smallest power of 2 that is greater than the previous term such that every partial sum (n&gt;1) is a prime.
 * @author Sean A. Irvine
 */
public class A073924 extends Sequence1 {

  private Z mSum = null;
  private int mK = 0;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Z.ONE;
      return Z.ONE;
    }
    while (true) {
      final Z t = mSum.setBit(++mK);
      if (t.isProbablePrime()) {
        mSum = t;
        return Z.ONE.shiftLeft(mK);
      }
    }
  }
}

