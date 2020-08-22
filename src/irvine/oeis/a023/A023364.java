package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023364 a(n+1) = a(n) converted to base 7 from base 2 (written in base 10).
 * @author Sean A. Irvine
 */
public class A023364 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : new Z(mA.toString(2), 7);
    return mA;
  }
}
