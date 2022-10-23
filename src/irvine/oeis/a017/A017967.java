package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017967 Powers of sqrt(21) rounded down.
 * @author Sean A. Irvine
 */
public class A017967 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(21);
    return mN.sqrt();
  }
}

