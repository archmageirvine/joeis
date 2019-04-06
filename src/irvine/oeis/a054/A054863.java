package irvine.oeis.a054;

import irvine.oeis.FiniteSequence;

/**
 * A054863 Dice markers in the board game &quot;The Settlers of Catan&quot;. There are a total of 18 markers, whose backs are assigned letters from A to R and whose fronts are assigned these numbers.
 * @author Georg Fischer
 */
public class A054863 extends FiniteSequence {

  /** Construct the sequence. */
  public A054863() {
    super(5, 2, 6, 3, 8, 10, 9, 12, 11, 4, 8, 10, 9, 4, 5, 6, 3, 11);
  }
}
