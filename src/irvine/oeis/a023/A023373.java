package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023373 a(n+1) = a(n) converted to base 5 from base 4 (written in base 10).
 * @author Sean A. Irvine
 */
public class A023373 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FOUR : new Z(mA.toString(4), 5);
    return mA;
  }
}
