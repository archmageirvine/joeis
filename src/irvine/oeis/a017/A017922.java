package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017922 Powers of sqrt(6) rounded down.
 * @author Sean A. Irvine
 */
public class A017922 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(6);
    return mN.sqrt();
  }
}

