package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062958 Numbers k such that phi(k+1) &lt; 2*phi(k), where phi = A000010.
 * @author Sean A. Irvine
 */
public class A062958 extends Sequence1 {

  private long mN = 1;
  private Z mPhi = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z prev = mPhi;
      mPhi = Functions.PHI.z(++mN);
      if (mPhi.compareTo(prev.multiply2()) < 0) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}

