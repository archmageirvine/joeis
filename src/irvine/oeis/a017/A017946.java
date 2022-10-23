package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017946 Powers of sqrt(14) rounded down.
 * @author Sean A. Irvine
 */
public class A017946 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(14);
    return mN.sqrt();
  }
}

