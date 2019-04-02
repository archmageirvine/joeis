package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.Mobius;
import irvine.oeis.Sequence;

/**
 * A007427 Moebius transform applied twice to sequence 1,0,0,0,....
 * @author Sean A. Irvine
 */
public class A007427 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final long d = dd.longValue();
      sum = sum.add(Mobius.mobius(d) * Mobius.mobius(mN / d));
    }
    return sum;
  }
}
