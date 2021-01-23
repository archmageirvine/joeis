package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023392 a(n+1) = a(n) converted to base 10 from base 9 (written in base 10).
 * @author Sean A. Irvine
 */
public class A023392 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.NINE : new Z(mA.toString(9));
    return mA;
  }
}
