package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017934 Powers of sqrt(10) rounded down.
 * @author Sean A. Irvine
 */
public class A017934 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(10);
    return mN.sqrt();
  }
}

