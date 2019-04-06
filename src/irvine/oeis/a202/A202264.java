package irvine.oeis.a202;

import irvine.oeis.FiniteSequence;

/**
 * A202264 Noncomposite numbers in which all substrings and reversal substrings are noncomposites.
 * @author Georg Fischer
 */
public class A202264 extends FiniteSequence {

  /** Construct the sequence. */
  public A202264() {
    super(1, 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 113, 131, 311, 313, 373);
  }
}
