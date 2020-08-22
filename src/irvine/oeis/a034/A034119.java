package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034119 Decimal part of cube root of a(n) starts with digit 3.
 * @author Sean A. Irvine
 */
public class A034119 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (ComputableReals.SINGLETON.pow(CR.valueOf(mN), CR.ONE_THIRD).frac().multiply(10).floor().longValue() == 3) {
        return mN;
      }
    }
  }
}

