package irvine.oeis.a075;

import irvine.oeis.FilterSequence;
import irvine.oeis.a046.A046316;

/**
 * A075814 Palindromic odd numbers with exactly 3 prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A075814 extends FilterSequence {

  /** Construct the sequence. */
  public A075814() {
    super(1, new A046316(), PALINDROME);
  }
}
