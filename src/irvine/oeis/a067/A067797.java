package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067797 Numbers k such that phi(k) + phi(k+1) = k+2.
 * @author Sean A. Irvine
 */
public class A067797 extends Sequence1 {

  private long mN = 3;
  private Z mPhi = Functions.PHI.z(4L);

  @Override
  public Z next() {
    while (true) {
      final Z t = mPhi;
      final long n = ++mN + 1;
      mPhi = Functions.PHI.z(n);
      if (mPhi.add(t).equals(mN + 2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
