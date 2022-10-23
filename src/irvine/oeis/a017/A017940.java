package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017940 Powers of sqrt(12) rounded down.
 * @author Sean A. Irvine
 */
public class A017940 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(12);
    return mN.sqrt();
  }
}

