package irvine.oeis.a211;

import irvine.oeis.FiniteSequence;

/**
 * A211123 One of 17 possible sets of eleven numbers of the form <code>3^alpha 5^beta 7^gamma</code> whose sum of reciprocals is 1.
 * @author Georg Fischer
 */
public class A211123 extends FiniteSequence {

  /** Construct the sequence. */
  public A211123() {
    super(3, 5, 7, 9, 15, 21, 25, 35, 63, 105, 225);
  }
}
