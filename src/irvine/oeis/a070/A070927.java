package irvine.oeis.a070;

import irvine.oeis.FiniteSequence;

/**
 * A070927 Second palindromic prime pyramids with <code>a(1)=2</code> such that (number of digits in <code>a(n+1)) =</code> (number of digits in <code>a(n)) + 2</code>.
 * @author Georg Fischer
 */
public class A070927 extends FiniteSequence {

  /** Construct the sequence. */
  public A070927() {
    super(2, 929, 39293, 3392933, 733929337L);
  }
}
