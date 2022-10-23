package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023365 a(n) = 2^(3^(n-1)).
 * @author Sean A. Irvine
 */
public class A023365 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : new Z(mA.toString(2), 8);
    return mA;
  }
}
