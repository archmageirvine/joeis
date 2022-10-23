package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017955 Powers of sqrt(17) rounded down.
 * @author Sean A. Irvine
 */
public class A017955 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(17);
    return mN.sqrt();
  }
}

