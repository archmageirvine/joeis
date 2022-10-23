package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034117 Fractional part of cube root of a(n) starts with digit 1.
 * @author Sean A. Irvine
 */
public class A034117 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (ComputableReals.SINGLETON.pow(CR.valueOf(mN), CR.ONE_THIRD).frac().multiply(10).floor().longValue() == 1) {
        return mN;
      }
    }
  }
}

