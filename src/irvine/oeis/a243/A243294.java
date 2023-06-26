package irvine.oeis.a243;

import irvine.oeis.FiniteSequence;

/**
 * A243294 Least number k &gt; 1 such that a number composed of k consecutive ascending digits starting with n is prime.
 * @author Georg Fischer
 */
public class A243294 extends FiniteSequence {

  /** Construct the sequence. */
  public A243294() {
    super(1, FINITE, 171, 2, 179, 4, 29, 2, 5, 2, 13);
  }
}
