package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002813 <code>a(0) = 4;</code> for <code>n &gt; 0, a(n) = a(n-1)^3 - 3*a(n-1)^2 + 3</code>.
 * @author Sean A. Irvine
 */
public class A002813 implements Sequence {

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

