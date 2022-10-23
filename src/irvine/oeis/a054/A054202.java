package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054202 a(n) = (n-1)! * Sum_{k=1..n} floor(k^k/k!).
 * @author Sean A. Irvine
 */
public class A054202 extends Sequence1 {

  private int mN = 0;
  private Z mF = Z.ONE;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z oldF = mF;
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mSum = mSum.add(Z.valueOf(mN).pow(mN).divide(mF));
    return mSum.multiply(oldF);
  }
}

