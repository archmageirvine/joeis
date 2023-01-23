package irvine.oeis.a106;

import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000521;
import irvine.oeis.transform.RootSequence;

/**
 * A106205 Expansion of (q*j(q))^(1/24) where j(q) is the elliptic modular invariant (A000521).
 * @author Georg Fischer
 */
public class A106205 extends RootSequence {

  /** Construct the sequence. */
  public A106205() {
    this(0, new A000521(), 1, 24);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param seq underlying sequence
   * @param num numerator of exponent
   * @param den denominator of exponent
   */
  public A106205(final int offset, final Sequence seq, final long num, final long den) {
    super(offset, new SkipSequence(seq, 1), num, den);
  }
}
