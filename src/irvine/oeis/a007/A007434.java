package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.Mobius;
import irvine.oeis.Sequence;

/**
 * A007434 Jordan function J_2(n) <code>(a</code> generalization of phi(n)).
 * @author Sean A. Irvine
 */
public class A007434 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      sum = sum.add(d.square().multiply(Mobius.mobius(mN / d.longValue())));
    }
    return sum;
  }
}
