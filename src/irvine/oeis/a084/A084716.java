package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084716 a(1) = 1, a(n) = smallest multiple of a(n-1) &gt; a(n-1) such that a(n) + 1 is a prime.
 * @author Sean A. Irvine
 */
public class A084716 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return mA;
    }
    final Z t = mA;
    while (true) {
      mA = mA.add(t);
      if (mA.add(1).isProbablePrime()) {
        return mA;
      }
    }
  }
}
