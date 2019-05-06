package irvine.oeis.a017;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017944 Powers of <code>sqrt(13)</code> rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A017944 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(13);
    return CR.valueOf(mN).sqrt().add(CR.HALF).floor();
  }
}

