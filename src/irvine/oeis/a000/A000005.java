package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000005 d(n) (also called tau(n) or sigma_0(n)), the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A000005 implements Sequence {

  protected long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Cheetah.factor(++mN).sigma0());
  }
}

