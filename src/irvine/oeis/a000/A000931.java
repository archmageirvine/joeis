package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A000931 Padovan sequence (or Padovan numbers): a(n) = a(n-2) + a(n-3) with a(0) = 1, a(1) = a(2) = 0.
 * @author Sean A. Irvine
 */
public class A000931 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000931(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000931() {
    super(0);
  }

  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;
  private Z mC = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mA.add(mB);
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    return n == 0 ? Z.ONE : (n < 3 ? Z.ZERO : Integers.SINGLETON.sum(0, (n - 3) / 2, k -> Binomial.binomial(k, n - 3 - 2 * k)));
  }
}
