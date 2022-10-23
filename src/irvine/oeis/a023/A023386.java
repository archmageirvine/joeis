package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023386 a(n+1) = a(n) converted to base 9 from base 6 (written in base 10).
 * @author Sean A. Irvine
 */
public class A023386 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SIX : new Z(mA.toString(6), 9);
    return mA;
  }
}
