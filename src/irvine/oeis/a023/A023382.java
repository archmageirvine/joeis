package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023382 a(n+1) = a(n) converted to base 9 from base 5 (written in base 10).
 * @author Sean A. Irvine
 */
public class A023382 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FIVE : new Z(mA.toString(5), 9);
    return mA;
  }
}
