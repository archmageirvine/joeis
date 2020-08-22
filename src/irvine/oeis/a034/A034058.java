package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034058 Decimal part of a(n)^(1/3) starts with n (cubes excluded).
 * @author Sean A. Irvine
 */
public class A034058 implements Sequence {

  private long mN = -1;
  private long mT = 10;

  @Override
  public Z next() {
    if (++mN == mT) {
      mT *= 10L;
    }
    if (mN == 0) {
      return Z.NINE;
    }
    Z m = Z.ONE;
    while (true) {
      m = m.add(1);
      if (ComputableReals.SINGLETON.pow(CR.valueOf(m), CR.ONE_THIRD).frac().multiply(mT).floor().longValueExact() == mN) {
        return m;
      }
    }
  }
}

