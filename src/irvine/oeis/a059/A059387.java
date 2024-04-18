package irvine.oeis.a059;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059387 Jordan function J_n(6) (see A059379).
 * @author Georg Fischer
 */
public class A059387 extends Sequence0 {

  protected long mN;
  
  /** Construct the sequence. */
  public A059387() {
    mN = -1;
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    ++mN;
    for (final Z d : Jaguar.factor(6).divisors()) {
      sum = sum.add(d.pow(mN).multiply(Functions.MOBIUS.i(6 / d.longValue())));
    }
    return sum;
  }
}
