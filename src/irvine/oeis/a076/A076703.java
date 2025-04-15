package irvine.oeis.a076;

import irvine.oeis.FilterSequence;
import irvine.oeis.a053.A053810;

/**
 * A076703 Palindromic prime powers of prime numbers.
 * @author Sean A. Irvine
 */
public class A076703 extends FilterSequence {

  /** Construct the sequence. */
  public A076703() {
    super(new A053810(), PALINDROME);
  }
}
