package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007750 Nonnegative integers n such that <code>n^2*(n+1)*(2*n+1)^2*(7*n+1)/36</code> is a square.
 * @author Sean A. Irvine
 */
public class A007750 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mB = null;
  private Z mC = null;
  private Z mD = null;

  @Override
  public Z next() {
    if (mD == null) {
      if (mB == null) {
        mB = Z.ZERO;
        return Z.ZERO;
      }
      if (mC == null) {
        mC = Z.ONE;
        return Z.ONE;
      }
      mD = Z.SEVEN;
    } else {
      final Z t = mC.multiply(16).subtract(mA).add(8);
      mA = mB;
      mB = mC;
      mC = mD;
      mD = t;
    }
    return mD;
  }
}

