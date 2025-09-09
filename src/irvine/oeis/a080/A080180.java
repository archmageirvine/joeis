package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080180 a(1)=1, a(n+1) = a(n) + spf(Sum_{i=1..n} a(i)), where spf=A020639 (smallest prime factor).
 * @author Sean A. Irvine
 */
public class A080180 extends Sequence1 {

  private Z mSum = Z.ZERO;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (!mSum.isZero()) {
      mA = mA.add(Functions.LPF.z(mSum));
    }
    mSum = mSum.add(mA);
    return mA;
  }
}

