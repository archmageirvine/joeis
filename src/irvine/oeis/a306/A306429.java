package irvine.oeis.a306;

import irvine.oeis.FiniteSequence;

/**
 * A306429 According to Larry Baggett, this sequence appeared on a Florida College Prep Exam. The exam question was, of course, given six or seven terms, to find the next term.
 * @author Georg Fischer
 */
public class A306429 extends FiniteSequence {

  /** Construct the sequence. */
  public A306429() {
    super(1, FINITE, 6, 42, 7, 12, 48, 16, 18, 18);
  }
}
