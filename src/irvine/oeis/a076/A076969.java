package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076969 a(1) = 1, a(n+1)= smallest cube greater than the n-th partial sum.
 * @author Sean A. Irvine
 */
public class A076969 extends Sequence1 {

  private Z mA = null;
  private Z mS = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return mA;
    }
    mA = mS.root(3).add(1).pow(3);
    mS = mS.add(mA);
    return mA;
  }
}

