package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048258 Integers whose sum of divisors is an 8th power.
 * @author Sean A. Irvine
 */
public class A048258 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = Functions.SIGMA.z(++mN);
      sigma.root(8);
      if (sigma.auxiliary() == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
