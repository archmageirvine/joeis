package irvine.oeis.a102;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.Sequence;

/**
 * A102171 Iccanobirt semiprime indices (1 of 15): Indices of semiprime numbers in A102111.
 * @author Georg Fischer
 */
public class A102171 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A102171() {
    this(new A102111());
  }

  /**
   * Generic constructor with parameter.
   * @param seq underlying sequence.
   */
  public A102171(final Sequence seq) {
    super(1, 0, seq, SEMIPRIME);
  }
}
