package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023391 a(n+1) = a(n) converted to base 9 from base 8 (written in base 10).
 * @author Sean A. Irvine
 */
public class A023391 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.EIGHT : new Z(mA.toString(8), 9);
    return mA;
  }
}
