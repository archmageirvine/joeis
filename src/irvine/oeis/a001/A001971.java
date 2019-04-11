package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001971 Nearest integer to <code>n^2/8</code>.
 * @author Sean A. Irvine
 */
public class A001971 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().add(5).subtract(mN.multiply2()).shiftRight(3);
  }
}
