package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023378 a(n+1) = a(n) converted to base 10 from base 4 (written in base 10).
 * @author Sean A. Irvine
 */
public class A023378 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FOUR : new Z(mA.toString(4));
    return mA;
  }
}
