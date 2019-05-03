package irvine.oeis.a211;

import irvine.oeis.FiniteSequence;

/**
 * A211126 One of 17 possible sets of eleven numbers of the form <code>3^alpha 5^beta 7^gamma</code> whose sum of reciprocals is 1.
 * @author Georg Fischer
 */
public class A211126 extends FiniteSequence {

  /** Construct the sequence. */
  public A211126() {
    super(3, 5, 7, 9, 15, 21, 25, 27, 105, 135, 225);
  }
}
