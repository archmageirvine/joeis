package irvine.oeis.a127;

import irvine.oeis.FiniteSequence;

/**
 * A127748 Largest n-digit emirp (A006567) with strictly decreasing (distinct) digits.
 * @author Georg Fischer
 */
public class A127748 extends FiniteSequence {

  /** Construct the sequence. */
  public A127748() {
    super(2, FINITE, 97, 983, 9871, 98731, 986543, 9875321);
  }
}
