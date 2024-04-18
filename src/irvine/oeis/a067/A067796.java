package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067796 Numbers k such that phi(k) + phi(k+1) = k.
 * @author Sean A. Irvine
 */
public class A067796 extends Sequence1 {

  private long mN = 13;
  private Z mPhi = Functions.PHI.z(14L);

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final Z t = mPhi;
      mPhi = Functions.PHI.z(mN + 1);
      if (mPhi.add(t).equals(n)) {
        return n;
      }
    }
  }
}
