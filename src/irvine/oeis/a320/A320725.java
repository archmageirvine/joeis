package irvine.oeis.a320;

import irvine.oeis.FiniteSequence;

/**
 * A320725 Prime numbers such that all other numbers obtained from all permutations of all subsets of the digits are nonprime.
 * @author Georg Fischer
 */
public class A320725 extends FiniteSequence {

  /** Construct the sequence. */
  public A320725() {
    super(2, 3, 5, 7, 11, 19, 41, 61, 89, 409, 449, 499, 881, 6469);
  }
}
