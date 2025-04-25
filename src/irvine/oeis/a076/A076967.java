package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076967 a(1) = 1, a(n+1) is the smallest square greater than the n-th partial sum.
 * @author Sean A. Irvine
 */
public class A076967 extends Sequence1 {

  private Z mA = null;
  private Z mS = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return mA;
    }
    mA = mS.sqrt().add(1).square();
    mS = mS.add(mA);
    return mA;
  }
}

