package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023367 a(n+1) = a(n) converted to base 4 from base 3 (written in base 10).
 * @author Sean A. Irvine
 */
public class A023367 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : new Z(mA.toString(3), 4);
    return mA;
  }
}
