package irvine.oeis.a065;

import irvine.math.Mobius;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065000 Numbers k such that Sum_{i=1..k} mu(sigma(i)) = 0.
 * @author Sean A. Irvine
 */
public class A065000 extends Sequence1 {

  private long mSum = 0;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mSum += Mobius.mobius(Functions.SIGMA.z(++mN).longValueExact());
      if (mSum == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
