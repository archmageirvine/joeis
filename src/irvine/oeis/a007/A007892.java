package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007892 A Kutz sequence.
 * @author Sean A. Irvine
 */
public class A007892 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.subtract(mN.divide(4).multiply(3)).square();
  }
}
