package irvine.oeis.a074;

import irvine.oeis.FiniteSequence;

/**
 * A074322 0 if pronounced name of n-th letter of English alphabet begin with a vowel sound, otherwise 1. Different from <code>A054638</code>.
 * @author Georg Fischer
 */
public class A074322 extends FiniteSequence {

  /** Construct the sequence. */
  public A074322() {
    super(0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1);
  }
}
