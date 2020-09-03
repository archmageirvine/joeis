package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034068 Decimal part of a(n)^(1/3) starts with n so that a(n)&lt;a(n+1).
 * @author Sean A. Irvine
 */
public class A034068 implements Sequence {

  private long mN = -1;
  private long mT = 10;
  private Z mM = Z.EIGHT;

  @Override
  public Z next() {
    if (++mN == mT) {
      mT *= 10L;
    }
    while (true) {
      mM = mM.add(1);
      if (ComputableReals.SINGLETON.pow(CR.valueOf(mM), CR.ONE_THIRD).frac().multiply(mT).floor().longValueExact() == mN) {
        return mM;
      }
    }
  }
}

