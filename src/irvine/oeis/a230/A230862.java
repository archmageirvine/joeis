package irvine.oeis.a230;

import irvine.oeis.FiniteSequence;

/**
 * A230862 Start with 0; each term when spelled out must start with the last letter of the previous term and must be the smallest such number that is greater than the previous term.
 * @author Georg Fischer
 */
public class A230862 extends FiniteSequence {

  /** Construct the sequence. */
  public A230862() {
    super(0, 1, 8, 10, 19, 90);
  }
}
