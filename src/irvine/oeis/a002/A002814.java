package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002814 For n &gt; 1: a(n) = a(n-1)^3 + 3a(n-1)^2 - 3; a(0) = 1, a(1) = 2.
 * @author Sean A. Irvine
 */
public class A002814 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (Z.ONE.equals(mA)) {
      mA = Z.TWO;
    } else {
      final Z t = mA.square();
      mA = t.multiply(mA).add(t.multiply(3)).subtract(3);
    }
    return mA;
  }
}

