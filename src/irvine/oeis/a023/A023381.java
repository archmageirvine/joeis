package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023381 a(n+1) = a(n) converted to base 8 from base 5 (written in base 10).
 * @author Sean A. Irvine
 */
public class A023381 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FIVE : new Z(mA.toString(5), 8);
    return mA;
  }
}
