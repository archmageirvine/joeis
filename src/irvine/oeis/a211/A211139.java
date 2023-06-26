package irvine.oeis.a211;

import irvine.oeis.FiniteSequence;

/**
 * A211139 One of 15 possible sets of eleven odd numbers, not all of the form 3^alpha 5^beta 7^gamma, whose sum of reciprocals is 1.
 * @author Georg Fischer
 */
public class A211139 extends FiniteSequence {

  /** Construct the sequence. */
  public A211139() {
    super(1, FINITE, 3, 5, 7, 9, 13, 19, 21, 35, 315, 325, 1425);
  }
}
