package irvine.oeis.a017;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017971 Powers of <code>sqrt(22)</code> rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A017971 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(22);
    return CR.valueOf(mN).sqrt().round();
  }
}

