package irvine.oeis.a194;

import irvine.oeis.InverseSequence;
import irvine.oeis.Sequence;

/**
 * A194834 Inverse permutation of A194833; every positive integer occurs exactly once.
 * @author Georg FIschere
 */
public class A194834 extends InverseSequence {

  /** Construct the sequence. */
  public A194834() {
    this(1, new A194833());
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seq underlying sequence
   */
  public A194834(final int offset, final Sequence seq) {
    super(offset, seq);
  }
}
