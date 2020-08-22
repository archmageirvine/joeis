package irvine.oeis.a090;

import irvine.oeis.FiniteSequence;

/**
 * A090572 Number of configurations of the 3-dimensional 2 X 2 X 2 sliding cube puzzle that require a minimum of n moves to be reached.
 * @author Georg Fischer
 */
public class A090572 extends FiniteSequence {

  /** Construct the sequence. */
  public A090572() {
    super(1, 3, 6, 12, 24, 48, 93, 180, 351, 675, 1191, 1963, 3015, 3772, 3732, 2837, 1589, 572, 78, 18);
  }
}
