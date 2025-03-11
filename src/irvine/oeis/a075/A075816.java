package irvine.oeis.a075;

import irvine.oeis.FilterSequence;

/**
 * A075816 Palindromic even numbers with exactly 3 prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A075816 extends FilterSequence {

  /** Construct the sequence. */
  public A075816() {
    super(1, new A075818(), PALINDROME);
  }
}
