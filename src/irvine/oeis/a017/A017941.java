package irvine.oeis.a017;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017941 Powers of sqrt(12) rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A017941 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(12);
    return CR.valueOf(mN).sqrt().add(CR.HALF).floor(32);
  }
}

