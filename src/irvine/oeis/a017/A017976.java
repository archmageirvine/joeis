package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017976 Powers of sqrt(24) rounded down.
 * @author Sean A. Irvine
 */
public class A017976 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(24);
    return mN.sqrt();
  }
}

