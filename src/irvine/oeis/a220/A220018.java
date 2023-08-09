package irvine.oeis.a220;
// manually holsig2/holos at 2023-08-08 18:53

import irvine.factor.factor.Jaguar;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A220018 Number of cyclotomic cosets of 3 mod 10^n.
 * @author Georg Fischer
 */
public class A220018 extends AbstractSequence {

  private Z mTen;
  private Z mOrder;

  /** Construct the sequence. */
  public A220018() {
    this(1, 3);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param order order
   */
  protected A220018(final int offset, final int order) {
    super(offset);
    mTen = Z.ONE;
    mOrder = Z.valueOf(order);
  }

  @Override
  public Z next() {
    mTen = mTen.multiply(Z.TEN);
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(mTen).divisors()) {
      sum = sum.add(Euler.phi(d).divide(new IntegersModMul(d).order(mOrder.mod(d))));
    }
    return sum;
  }
}

