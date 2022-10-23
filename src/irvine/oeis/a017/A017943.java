package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017943 Powers of sqrt(13) rounded down.
 * @author Sean A. Irvine
 */
public class A017943 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(13);
    return mN.sqrt();
  }
}

