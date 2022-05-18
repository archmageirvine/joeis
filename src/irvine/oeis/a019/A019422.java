package irvine.oeis.a019;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019422 Numbers whose sum of divisors is a fourth power.
 * @author Sean A. Irvine
 */
public class A019422 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = Jaguar.factor(++mN).sigma();
      sigma.root(4);
      if (sigma.auxiliary() != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

