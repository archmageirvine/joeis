package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067701 Numbers n such that phi(n-1) + phi(n+1) = phi(2n).
 * @author Sean A. Irvine
 */
public class A067701 extends Sequence1 {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      final long n = mN++;
      if (Functions.PHI.z(n).add(Functions.PHI.z(mN + 1)).equals(Functions.PHI.z(2 * mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
