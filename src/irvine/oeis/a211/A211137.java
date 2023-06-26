package irvine.oeis.a211;

import irvine.oeis.FiniteSequence;

/**
 * A211137 One of 15 possible sets of eleven odd numbers, not all of the form 3^alpha 5^beta 7^gamma, whose sum of reciprocals is 1.
 * @author Georg Fischer
 */
public class A211137 extends FiniteSequence {

  /** Construct the sequence. */
  public A211137() {
    super(1, FINITE, 3, 5, 7, 9, 15, 21, 23, 45, 69, 105, 115);
  }
}
