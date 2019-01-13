package irvine.oeis.a005;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005012.
 * @author Sean A. Irvine
 */
public class A005012 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z mA = Z.ZERO;
    Z mF = Z.ONE;
    for (long k = 0; k <= mN; ++k) {
      mA = mA.add(mF.multiply(Stirling.secondKind(mN, mN - k)));
      mF = mF.multiply(6);
    }
    return mA;
  }

}

