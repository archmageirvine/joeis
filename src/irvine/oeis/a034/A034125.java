package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034125 Decimal part of cube root of n starts with digit 9.
 * @author Sean A. Irvine
 */
public class A034125 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (ComputableReals.SINGLETON.pow(CR.valueOf(mN), CR.ONE_THIRD).frac().multiply(10).floor().longValue() == 9) {
        return mN;
      }
    }
  }
}

