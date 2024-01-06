package irvine.oeis.a067;

import irvine.math.z.Euler;
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
      if (Euler.phi(mN++).add(Euler.phi(mN + 1)).equals(Euler.phi(2 * mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
