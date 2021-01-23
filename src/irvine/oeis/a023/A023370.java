package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023370 a(n+1) = a(n) converted to base 7 from base 3 (written in base 10).
 * @author Sean A. Irvine
 */
public class A023370 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : new Z(mA.toString(3), 7);
    return mA;
  }
}
