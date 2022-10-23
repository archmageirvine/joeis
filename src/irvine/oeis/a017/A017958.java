package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017958 Powers of sqrt(18) rounded down.
 * @author Sean A. Irvine
 */
public class A017958 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(18);
    return mN.sqrt();
  }
}

