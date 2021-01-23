package irvine.oeis.a211;

import irvine.oeis.FiniteSequence;

/**
 * A211135 One of 15 possible sets of eleven odd numbers, not all of the form 3^alpha 5^beta 7^gamma, whose sum of reciprocals is 1.
 * @author Georg Fischer
 */
public class A211135 extends FiniteSequence {

  /** Construct the sequence. */
  public A211135() {
    super(3, 5, 7, 9, 15, 11, 33, 35, 45, 55, 77, 105);
  }
}
