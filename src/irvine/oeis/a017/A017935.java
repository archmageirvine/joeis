package irvine.oeis.a017;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017935 Powers of sqrt(10) rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A017935 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(10);
    return CR.valueOf(mN).sqrt().round();
  }
}

