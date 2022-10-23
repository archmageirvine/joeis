package irvine.oeis.a017;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017968 Powers of sqrt(21) rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A017968 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(21);
    return CR.valueOf(mN).sqrt().round();
  }
}

