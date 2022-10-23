package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017928 Powers of sqrt(8) rounded down.
 * @author Sean A. Irvine
 */
public class A017928 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(8);
    return mN.sqrt();
  }
}

