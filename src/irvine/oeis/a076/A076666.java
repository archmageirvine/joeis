package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076666 Numbers n such that sigma(n) + sigma(n+3) = sigma(n+1) + sigma(n+2).
 * @author Sean A. Irvine
 */
public class A076666 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).add(Functions.SIGMA1.z(mN + 3)).equals(Functions.SIGMA1.z(mN + 1).add(Functions.SIGMA1.z(mN + 2)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
