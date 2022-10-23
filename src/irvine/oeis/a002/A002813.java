package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002813 a(0) = 4; for n &gt; 0, a(n) = a(n-1)^3 - 3*a(n-1)^2 + 3.
 * @author Sean A. Irvine
 */
public class A002813 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.FOUR;
    } else {
      final Z t = mA.square();
      mA = t.multiply(mA).subtract(t.multiply(3)).add(3);
    }
    return mA;
  }
}

