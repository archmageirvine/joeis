package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001019 Powers of 9: <code>a(n) = 9^n</code>.
 * @author Sean A. Irvine
 */
public class A001019 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(9);
    return mN;
  }
}
