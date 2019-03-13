package irvine.oeis.a019;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019423.
 * @author Sean A. Irvine
 */
public class A019423 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = Cheetah.factor(++mN).sigma();
      sigma.root(5);
      if (sigma.auxiliary() != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

