package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000079 Powers of 2: <code>a(n) = 2^n</code>.
 * @author Sean A. Irvine
 */
public class A000079 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.ONE;
    } else {
      mN = mN.multiply2();
    }
    return mN;
  }
}
