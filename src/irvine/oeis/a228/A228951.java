package irvine.oeis.a228;

import irvine.oeis.FiniteSequence;

/**
 * A228951 Numbers n such that decimal expansion of <code>n^n</code> has only one zero.
 * @author Georg Fischer
 */
public class A228951 extends FiniteSequence {

  /** Construct the sequence. */
  public A228951() {
    super(9, 11, 17, 19, 21, 28, 29);
  }
}
