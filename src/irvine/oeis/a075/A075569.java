package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075569 a(1)=1, then smallest number &gt;= the previous term such that every partial sum is a prime.
 * @author Sean A. Irvine
 */
public class A075569 extends Sequence1 {

  private Z mA = null;
  private Z mSum = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    while (true) {
      final Z m = mSum.add(mA);
      if (m.isProbablePrime()) {
        mSum = m;
        return mA;
      }
      mA = mA.add(1);
    }
  }
}

