package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067798 Numbers n such that phi(n)+phi(n+1)=n+1.
 * @author Sean A. Irvine
 */
public class A067798 extends Sequence1 {

  private long mN = 1;
  private Z mPhi = Functions.PHI.z(1L);

  @Override
  public Z next() {
    while (true) {
      final Z t = mPhi;
      final long n = ++mN;
      mPhi = Functions.PHI.z(n);
      if (mPhi.add(t).equals(mN)) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
