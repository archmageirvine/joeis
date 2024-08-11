package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071258 a(1) = 4; a(n) = smallest composite number of form k*a(n-1) + 1 with k &gt; 1.
 * @author Sean A. Irvine
 */
public class A071258 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.FOUR;
      return Z.FOUR;
    }
    Z k = mA;
    while (true) {
      k = k.add(mA);
      final Z t = k.add(1);
      if (!t.isProbablePrime()) {
        mA = t;
        return t;
      }
    }
  }
}
