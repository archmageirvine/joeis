package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A007434 Jordan function J_2(n) (a generalization of phi(n)).
 * @author Sean A. Irvine
 */
public class A007434 extends AbstractSequence {

  /** Construct the sequence. */
  public A007434() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(d.square().multiply(Mobius.mobius(mN / d.longValue())));
    }
    return sum;
  }
}
