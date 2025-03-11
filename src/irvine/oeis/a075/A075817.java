package irvine.oeis.a075;

import irvine.oeis.FilterSequence;
import irvine.oeis.a046.A046470;

/**
 * A075817 Palindromic even numbers with an odd number of prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A075817 extends FilterSequence {

  /** Construct the sequence. */
  public A075817() {
    super(1, new A046470(), PALINDROME);
  }
}
