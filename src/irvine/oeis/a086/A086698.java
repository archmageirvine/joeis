package irvine.oeis.a086;

import irvine.oeis.FiniteSequence;

/**
 * A086698 Two-sided semiprimes: deleting any number of digits at left or at right, but not both, leaves a semiprime.
 * @author Georg Fischer
 */
public class A086698 extends FiniteSequence {

  /** Construct the sequence. */
  public A086698() {
    super(1, FINITE, 4, 6, 9, 46, 49, 69, 94, 469, 626, 694, 914, 934, 939, 949, 4694, 4934, 4939, 9134, 9346, 9586, 62386, 62614, 91346, 959939, 6998339, 91439939);
  }
}
