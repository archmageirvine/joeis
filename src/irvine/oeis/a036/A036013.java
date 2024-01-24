package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036013 a(n) = smallest number &gt; 1 such that a(1)a(2)...a(n) - 1 is prime (or 1).
 * @author Sean A. Irvine
 */
public class A036013 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.TWO;
    }
    long k = 1;
    while (true) {
      final Z t = mA.multiply(++k);
      if (t.subtract(1).isProbablePrime()) {
        mA = t;
        return Z.valueOf(k);
      }
    }
  }
}

