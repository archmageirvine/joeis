package irvine.oeis.a152;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A152235 Largest squarefree number dividing the number of divisors n.
 * @author Sean A. Irvine
 */
public class A152235 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z p = Z.ONE;
    for (final Z z : Cheetah.factor(Cheetah.factor(++mN).sigma0()).toZArray()) {
      p = p.multiply(z);
    }
    return p;
  }
}

