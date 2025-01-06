package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A007434 Jordan function J_2(n) (a generalization of phi(n)).
 * @author Sean A. Irvine
 */
public class A007434 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A007434(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A007434() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(d.square().multiply(Functions.MOBIUS.i(mN / d.longValue())));
    }
    return sum;
  }

  @Override
  public Z a(final Z n) {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(n).divisors()) {
      sum = sum.add(d.square().multiply(Functions.MOBIUS.i(n.divide(d))));
    }
    return sum;
  }

  @Override
  public Z a(final int n) {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(n).divisors()) {
      sum = sum.add(d.square().multiply(Functions.MOBIUS.i(Z.valueOf(n).divide(d))));
    }
    return sum;
  }

}
