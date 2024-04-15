package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067730 Numbers n such that sigma(n-1) + sigma(n+1) = sigma(2n).
 * @author Sean A. Irvine
 */
public class A067730 extends Sequence1 {

  private long mN = 308;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA.z(mN++).add(Functions.SIGMA.z(mN + 1)).equals(Functions.SIGMA.z(2 * mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
