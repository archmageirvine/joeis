package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007611 a(n) = n! + 2^n.
 * @author Sean A. Irvine
 */
public class A007611 implements Sequence {

  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return mF.add(Z.ONE.shiftLeft(mN));
  }
}
