package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017961 Powers of sqrt(19) rounded down.
 * @author Sean A. Irvine
 */
public class A017961 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(19);
    return mN.sqrt();
  }
}

