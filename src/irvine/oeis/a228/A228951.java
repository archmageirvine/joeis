package irvine.oeis.a228;

import irvine.oeis.FiniteSequence;

/**
 * A228951 Numbers k such that decimal expansion of k^k has only one zero.
 * @author Georg Fischer
 */
public class A228951 extends FiniteSequence {

  /** Construct the sequence. */
  public A228951() {
    super(1, FINITE, 9, 11, 17, 19, 21, 28, 29);
  }
}
