package irvine.oeis.a102;

import irvine.oeis.SemiprimeSequence;
import irvine.oeis.Sequence;

/**
 * A102171 Iccanobirt semiprime indices (1 of 15): Indices of semiprime numbers in A102111.
 * @author Georg Fischer
 */
public class A102171 extends SemiprimeSequence {

  /** Construct the sequence. */
  public A102171() {
    this(new A102111());
  }

  /**
   * Generic constructor with parameter.
   * @param seq underlying sequence.
   */
  public A102171(final Sequence seq) {
    super(seq, 0);
  }
}
