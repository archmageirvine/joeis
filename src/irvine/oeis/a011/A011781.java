package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011781 Sextuple factorial numbers: <code>a(n) =</code> Product_{k=0..n-1} <code>(6*k+3)</code>.
 * @author Sean A. Irvine
 */
public class A011781 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -9;

  @Override
  public Z next() {
    mN += 6;
    if (mN >= 0) {
      mA = mA.multiply(mN);
    }
    return mA;
  }
}
