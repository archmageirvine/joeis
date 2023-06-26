package irvine.oeis.a242;

import irvine.oeis.FiniteSequence;

/**
 * A242935 Number of forced tiles in the local empire of the eight possible vertex configurations in a Penrose rhomb tiling, in the order D, J, S, Q, S5, K, S3, S4.
 * @author Georg Fischer
 */
public class A242935 extends FiniteSequence {

  /** Construct the sequence. */
  public A242935() {
    super(1, FINITE, 0, 2, 5, 10, 25, 27, 43, 99);
  }
}
