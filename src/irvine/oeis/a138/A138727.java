package irvine.oeis.a138;

import irvine.oeis.FiniteSequence;

/**
 * A138727 Numbers n whose hexadecimal representation is the n-th member of the alphanumeric sequence: 1A, 2A, 3B, 4B, 5B, 6B, 7B, 8B, 8B, 8B, 1B, 2B, 3A, 4A, 5A, 6A, 7A, 8A. (A notation convention of the groups in the periodic table of the elements with 18 columns).
 * @author Georg Fischer
 */
public class A138727 extends FiniteSequence {

  /** Construct the sequence. */
  public A138727() {
    super(26, 42, 59, 75, 91, 107, 123, 139, 139, 139, 27, 43, 58, 74, 90, 106, 122, 138);
  }
}
