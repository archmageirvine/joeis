package irvine.oeis.a008;

import irvine.oeis.FilterSequence;

/**
 * A008510 Numbers k such that both k and the k-th triangular number are palindromes.
 * @author Sean A. Irvine
 */
public class A008510 extends FilterSequence {

  /** Construct the sequence. */
  public A008510() {
    super(new A008509(), PALINDROME);
  }
}

