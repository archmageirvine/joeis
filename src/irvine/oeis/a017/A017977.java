package irvine.oeis.a017;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017977 Powers of sqrt(24) rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A017977 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(24);
    return CR.valueOf(mN).sqrt().round();
  }
}

