package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023368 a(n+1) = a(n) converted to base 5 from base 3 (written in base 10).
 * @author Sean A. Irvine
 */
public class A023368 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : new Z(mA.toString(3), 5);
    return mA;
  }
}
