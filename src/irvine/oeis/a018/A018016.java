package irvine.oeis.a018;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018016 Powers of cube root of 14 rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A018016 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(14);
    return ComputableReals.SINGLETON.pow(CR.valueOf(mN), CR.ONE_THIRD).round();
  }
}

