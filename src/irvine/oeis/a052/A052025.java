package irvine.oeis.a052;

import irvine.oeis.FiniteSequence;

/**
 * A052025 Every prefix (or suffix) of palindromic prime <code>a(n)</code> is prime <code>(right/left-truncatable)</code>.
 * @author Georg Fischer
 */
public class A052025 extends FiniteSequence {

  /** Construct the sequence. */
  public A052025() {
    super(2, 3, 5, 7, 313, 373, 797);
  }
}
