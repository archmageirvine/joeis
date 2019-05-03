package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001020 Powers of <code>11: a(n) = 11^n</code>.
 * @author Sean A. Irvine
 */
public class A001020 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(11);
    return mN;
  }
}
