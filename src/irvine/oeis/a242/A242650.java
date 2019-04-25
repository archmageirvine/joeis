package irvine.oeis.a242;

import irvine.oeis.FiniteSequence;

/**
 * A242650 For <code>any</code> number m there is a number k such that m-k^3 is congruent <code>mod 96</code> to one of these 12 numbers.
 * @author Georg Fischer
 */
public class A242650 extends FiniteSequence {

  /** Construct the sequence. */
  public A242650() {
    super(6, 12, 18, 24, 30, 36, 48, 54, 60, 66, 78, 84);
  }
}
