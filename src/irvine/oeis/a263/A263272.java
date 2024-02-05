package irvine.oeis.a263;
// manually 2024-02-05

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A263272 Self-inverse permutation of nonnegative integers: a(n) = A263273(2*n) / 2.
 * @author Georg Fischer
 */
public class A263272 extends AbstractSequence implements DirectSequence {

  private final A263273 mSeq = new A263273();
  private int mN = -1;

  /** Construct the sequence. */
  public A263272() {
    super(0);
  }

  @Override
  public Z a(final Z n) {
    return mSeq.a(n.multiply2()).divide2();
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
