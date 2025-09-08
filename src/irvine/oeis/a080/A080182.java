package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080182 a(1) = 1, a(n+1) = a(n) + gpf(Sum_{i=1..n} a(i)), where gpf=A006530 (greatest prime factor).
 * @author Sean A. Irvine
 */
public class A080182 extends Sequence1 {

  private Z mSum = Z.ZERO;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (!mSum.isZero()) {
      mA = mA.add(Functions.GPF.z(mSum));
    }
    mSum = mSum.add(mA);
    return mA;
  }
}

