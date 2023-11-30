package irvine.oeis.a306;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A306938 If n is divisible by 3 then a(n) = n/3 otherwise a(n) = floor(n*sqrt(3)).
 * @author Georg Fischer
 */
public class A306938 extends AbstractSequence implements DirectSequence {

  private int mN;

  /** Construct the sequence. */
  public A306938() {
    super(1);
    mN = 0;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    final Z[] quot = n.divideAndRemainder(Z.THREE);
    return quot[1].isZero() ? quot[0] : n.square().multiply(3).sqrt();
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
