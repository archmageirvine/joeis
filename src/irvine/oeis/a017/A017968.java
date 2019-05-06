package irvine.oeis.a017;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017968 Powers of <code>sqrt(21)</code> rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A017968 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(21);
    return CR.valueOf(mN).sqrt().add(CR.HALF).floor();
  }
}

