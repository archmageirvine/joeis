package irvine.oeis.a029;

import irvine.oeis.FilterSequence;

/**
 * A029731 Palindromic in bases 10 and 16.
 * @author Sean A. Irvine
 */
public class A029731 extends FilterSequence {

  /** Construct the sequence. */
  public A029731() {
    super(new A029730(), PALINDROME);
  }
}
