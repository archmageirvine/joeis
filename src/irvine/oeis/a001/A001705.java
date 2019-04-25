package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001705 Generalized Stirling numbers: <code>a(n) = n! * Sum_{k=0..n-1} (k+1)/(n-k)</code>.
 * @author Sean A. Irvine
 */
public class A001705 implements Sequence {

  private long mN = -1;
  private Z mA = Z.NEG_ONE;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mA = mA.multiply(mN + 1).add(mF);
    return mA;
  }
}
