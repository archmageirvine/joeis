package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001018 Powers of 8: a(n) = 8^n.
 * @author Sean A. Irvine
 */
public class A001018 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.shiftLeft(3);
    return mN;
  }
}
