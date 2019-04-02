package irvine.oeis.a017;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017914 Powers of sqrt(3) rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A017914 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(3);
    return CR.valueOf(mN).sqrt().add(CR.HALF).floor(32);
  }
}

