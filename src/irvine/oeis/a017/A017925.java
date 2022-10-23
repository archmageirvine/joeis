package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017925 Powers of sqrt(7) rounded down.
 * @author Sean A. Irvine
 */
public class A017925 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(7);
    return mN.sqrt();
  }
}

