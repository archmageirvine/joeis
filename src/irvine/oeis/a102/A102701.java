package irvine.oeis.a102;

import irvine.oeis.FiniteSequence;

/**
 * A102701 <code>Non-"Ding!Bong!"</code> numbers: positive numbers which are not a positive linear combination of <code>5</code>'s and <code>7</code>'s.
 * @author Georg Fischer
 */
public class A102701 extends FiniteSequence {

  /** Construct the sequence. */
  public A102701() {
    super(1, 2, 3, 4, 6, 8, 9, 11, 13, 16, 18, 23);
  }
}
