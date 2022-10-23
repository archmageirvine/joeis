package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001020 Powers of 11: a(n) = 11^n.
 * @author Sean A. Irvine
 */
public class A001020 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(11);
    return mN;
  }
}
