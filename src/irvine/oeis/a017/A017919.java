package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017919 Powers of sqrt(5) rounded down.
 * @author Sean A. Irvine
 */
public class A017919 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(5);
    return mN.sqrt();
  }
}

