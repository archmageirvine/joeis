package irvine.oeis.a059;

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059387 Jordan function J_n(6) (see A059379).
 * @author Georg Fischer
 */
public class A059387 implements Sequence {

  protected long mN;
  
  /** Construct the sequence. */
  public A059387() {
    mN = -1;
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    ++mN;
    for (final Z d : Cheetah.factor(6).divisors()) {
      sum = sum.add(d.pow(mN).multiply(Mobius.mobius(6 / d.longValue())));
    }
    return sum;
  }
}
