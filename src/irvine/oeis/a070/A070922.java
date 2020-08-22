package irvine.oeis.a070;

import irvine.oeis.FiniteSequence;

/**
 * A070922 First palindromic prime pyramids with a(1)=2 such that (number of digits in a(n+1)) = (number of digits in a(n)) + 2.
 * @author Georg Fischer
 */
public class A070922 extends FiniteSequence {

  /** Construct the sequence. */
  public A070922() {
    super(2, 929, 39293, 7392937, 373929373L);
  }
}
