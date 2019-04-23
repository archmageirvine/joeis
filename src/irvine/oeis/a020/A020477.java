package irvine.oeis.a020;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020477 Sum of divisors of n is a cube.
 * @author Sean A. Irvine
 */
public class A020477 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z s = Cheetah.factor(++mN).sigma();
      s.root(3);
      if (s.auxiliary() != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
