package irvine.oeis.a017;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017923 Powers of sqrt(6) rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A017923 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(6);
    return CR.valueOf(mN).sqrt().round();
  }
}

