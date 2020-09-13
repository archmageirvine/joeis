package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034897 Hyperperfect numbers: x such that x = 1 + k*(sigma(x)-x-1) for some k &gt; 0.
 * @author Sean A. Irvine
 */
public class A034897 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final Z s = Cheetah.factor(++mN).sigma().subtract(mN + 1);
      if (s.signum() != 0 && Z.ZERO.equals(Z.valueOf(mN - 1).mod(s))) {
        return Z.valueOf(mN);
      }
    }
  }
}
