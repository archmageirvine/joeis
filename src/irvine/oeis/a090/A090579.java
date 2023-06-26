package irvine.oeis.a090;

import irvine.oeis.FiniteSequence;

/**
 * A090579 Number of numbers with 4 decimal digits and sum of digits = n.
 * @author Georg Fischer
 */
public class A090579 extends FiniteSequence {

  /** Construct the sequence. */
  public A090579() {
    super(1, FINITE, 1, 4, 10, 20, 35, 56, 84, 120, 165, 219, 279, 342, 405, 465, 519, 564, 597, 615, 615, 597, 564, 519, 465, 405, 342, 279, 219, 165, 120, 84, 56, 35, 20, 10, 4, 1);
  }
}
