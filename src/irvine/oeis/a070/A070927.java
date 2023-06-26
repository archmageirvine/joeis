package irvine.oeis.a070;

import irvine.oeis.FiniteSequence;

/**
 * A070927 Second palindromic prime pyramids with a(1)=2 such that (number of digits in a(n+1)) = (number of digits in a(n)) + 2.
 * @author Georg Fischer
 */
public class A070927 extends FiniteSequence {

  /** Construct the sequence. */
  public A070927() {
    super(1, FINITE, 2, 929, 39293, 3392933, 733929337L);
  }
}
