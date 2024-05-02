package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067929 Numbers k that divide the alternating sum phi(1) - phi(2) + phi(3) - phi(4) + ... + ((-1)^(k+1))*phi(k).
 * @author Sean A. Irvine
 */
public class A067929 extends Sequence1 {

  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z phi = Functions.PHI.z(++mN);
      mSum = mSum.signedAdd((mN & 1) == 1, phi);
      if (mSum.mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
