package irvine.oeis.a017;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017995 Powers of cube root of 7 rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A017995 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(7);
    return ComputableReals.SINGLETON.pow(CR.valueOf(mN), CR.ONE_THIRD).round();
  }
}

