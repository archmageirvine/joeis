package irvine.oeis.a373;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A373033 a(n+1) = a(n) converted to base 10 from base 4 (written in base 10); a(1)=5.
 * @author Sean A. Irvine
 */
public class A373033 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FIVE : new Z(mA.toString(4));
    return mA;
  }
}
