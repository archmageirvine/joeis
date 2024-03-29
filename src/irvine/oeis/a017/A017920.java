package irvine.oeis.a017;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017920 Powers of sqrt(5) rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A017920 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(5);
    return CR.valueOf(mN).sqrt().round();
  }
}

