package irvine.oeis.a211;

import irvine.oeis.FiniteSequence;

/**
 * A211130 One of 17 possible sets of eleven numbers of the form 3^alpha 5^beta 7^gamma whose sum of reciprocals is 1.
 * @author Georg Fischer
 */
public class A211130 extends FiniteSequence {

  /** Construct the sequence. */
  public A211130() {
    super(3, 5, 7, 9, 15, 21, 25, 27, 63, 189, 4725);
  }
}
