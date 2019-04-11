package irvine.oeis.a017;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017950 Powers of <code>sqrt(15)</code> rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A017950 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(15);
    return CR.valueOf(mN).sqrt().add(CR.HALF).floor(32);
  }
}

