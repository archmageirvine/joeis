package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076971 a(1) = 1, a(n+1)= smallest triangular number greater than the n-th partial sum.
 * @author Sean A. Irvine
 */
public class A076971 extends Sequence1 {

  private Z mA = null;
  private Z mS = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return mA;
    }
    mA = Functions.TRIANGULAR.z(Functions.TRINV.z(mS).add(1));
    mS = mS.add(mA);
    return mA;
  }
}

