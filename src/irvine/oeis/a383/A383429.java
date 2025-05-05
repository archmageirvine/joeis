package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077046.
 * @author Sean A. Irvine
 */
public class A383429 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final String s = mA.toString();
      mA = new Z(s + s.length());
    }
    return mA;
  }
}

