package irvine.oeis.a017;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017974 Powers of <code>sqrt(23)</code> rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A017974 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(23);
    return CR.valueOf(mN).sqrt().round();
  }
}

