package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080183 a(1)=A080182(1), a(n)=a(n-1)+A080182(n) for n&gt;1.
 * @author Sean A. Irvine
 */
public class A080183 extends Sequence1 {

  private Z mSum = Z.ZERO;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (!mSum.isZero()) {
      mA = mA.add(Functions.GPF.z(mSum));
    }
    mSum = mSum.add(mA);
    return mSum;
  }
}

