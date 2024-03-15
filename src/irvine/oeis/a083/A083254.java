package irvine.oeis.a083;
// manually 2024-03-14

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A083254 a(n) = 2*phi(n) - n.
 * @author Georg Fischer
 */
public class A083254 extends AbstractSequence implements DirectSequence {

  private int mN;

  /** Construct the sequence. */
  public A083254() {
    super(1);
    mN = 0;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    return Jaguar.factor(n).phi().multiply2().subtract(n);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
