package irvine.oeis.a152;

import irvine.oeis.FiniteSequence;

/**
 * A152491 Numbers n such that 1/c = 1/n + 1/S(n). c, n positive integers (A000027(n)), S(n) sum of digits of n (A007953(n)).
 * @author Georg Fischer
 */
public class A152491 extends FiniteSequence {

  /** Construct the sequence. */
  public A152491() {
    super(1, FINITE, 2, 4, 6, 8, 18, 72);
  }
}
