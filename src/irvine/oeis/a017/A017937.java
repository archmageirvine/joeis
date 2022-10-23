package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017937 Powers of sqrt(11) rounded down.
 * @author Sean A. Irvine
 */
public class A017937 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(11);
    return mN.sqrt();
  }
}

