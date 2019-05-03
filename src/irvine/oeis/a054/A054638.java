package irvine.oeis.a054;

import irvine.oeis.FiniteSequence;

/**
 * A054638 0 if pronounced name of n-th letter of English alphabet begin with a vowel sound, otherwise 1. Different from <code>A074322</code>.
 * @author Georg Fischer
 */
public class A054638 extends FiniteSequence {

  /** Construct the sequence. */
  public A054638() {
    super(0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1);
  }
}
