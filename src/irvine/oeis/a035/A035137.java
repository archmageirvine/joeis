package irvine.oeis.a035;

import irvine.oeis.ComplementSequence;
import irvine.oeis.a260.A260255;

/**
 * A035137 Numbers that are not the sum of 2 palindromes (where 0 is considered a palindrome).
 * @author Sean A. Irvine
 */
public class A035137 extends ComplementSequence {

  /** Construct the sequence. */
  public A035137() {
    super(new A260255());
  }
}

