package irvine.oeis.a019;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019422 Numbers n such that sum of divisors of n is a fourth power.
 * @author Sean A. Irvine
 */
public class A019422 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = Cheetah.factor(++mN).sigma();
      sigma.root(4);
      if (sigma.auxiliary() != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

