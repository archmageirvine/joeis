package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a033.A033950;

/**
 * A036761 Number of refactorable integers (A033950) of binary order (A029837) n.
 * @author Sean A. Irvine
 */
public class A036761 extends A033950 {

  private Z mLim = Z.ONE;
  private Z mA = super.next();

  @Override
  public Z next() {
    long count = 0;
    while (mA.compareTo(mLim) <= 0) {
      ++count;
      mA = super.next();
    }
    mLim = mLim.multiply2();
    return Z.valueOf(count);
  }
}
