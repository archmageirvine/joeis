package irvine.oeis.a075;

import irvine.oeis.FilterSequence;
import irvine.oeis.a056.A056913;

/**
 * A075810 Palindromic odd squarefree numbers with an even number of distinct prime factors.
 * @author Sean A. Irvine
 */
public class A075810 extends FilterSequence {

  /** Construct the sequence. */
  public A075810() {
    super(1, new A056913(), PALINDROME);
  }
}
