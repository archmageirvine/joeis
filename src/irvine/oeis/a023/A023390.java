package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023390 a(n+1) = a(n) written in base 7 (read in base 10); a(1) = 7.
 * @author Sean A. Irvine
 */
public class A023390 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SEVEN : new Z(mA.toString(7));
    return mA;
  }
}
