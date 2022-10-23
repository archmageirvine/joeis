package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017964 Powers of sqrt(20) rounded down.
 * @author Sean A. Irvine
 */
public class A017964 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(20);
    return mN.sqrt();
  }
}

