package irvine.oeis.a017;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017920.
 * @author Sean A. Irvine
 */
public class A017920 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(5);
    return CR.valueOf(mN).sqrt().add(CR.HALF).floor(32);
  }
}

