package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048257 Integers whose sum of divisors is a 7th power.
 * @author Sean A. Irvine
 */
public class A048257 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = Jaguar.factor(++mN).sigma();
      sigma.root(7);
      if (sigma.auxiliary() == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
