package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067143 Numbers n such that phi(n+1) = 3*phi(n).
 * @author Sean A. Irvine
 */
public class A067143 extends Sequence1 {

  private long mN = 4;
  private Z mPhi = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z s = mPhi;
      final long n = ++mN;
      mPhi = Functions.PHI.z(n);
      if (mPhi.equals(s.multiply(3))) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
