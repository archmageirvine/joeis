package irvine.oeis.a082;

import irvine.oeis.FilterSequence;

/**
 * A082940 Palindromes in A082939.
 * @author Sean A. Irvine
 */
public class A082940 extends FilterSequence {

  /** Construct the sequence. */
  public A082940() {
    super(1, new A082939(), PALINDROME);
  }
}
