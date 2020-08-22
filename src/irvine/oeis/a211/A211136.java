package irvine.oeis.a211;

import irvine.oeis.FiniteSequence;

/**
 * A211136 One of 15 possible sets of eleven odd numbers, not all of the form 3^alpha 5^beta 7^gamma, whose sum of reciprocals is 1.
 * @author Georg Fischer
 */
public class A211136 extends FiniteSequence {

  /** Construct the sequence. */
  public A211136() {
    super(3, 5, 7, 9, 13, 15, 25, 75, 105, 315, 325);
  }
}
