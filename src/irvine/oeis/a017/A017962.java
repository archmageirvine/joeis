package irvine.oeis.a017;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017962 Powers of sqrt(19) rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A017962 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(19);
    return CR.valueOf(mN).sqrt().round();
  }
}

