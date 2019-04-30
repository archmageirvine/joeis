package irvine.oeis.a152;

import irvine.oeis.FiniteSequence;

/**
 * A152491 Numbers n such that 1/c <code>= 1/n + 1/S(n)</code>. c, n positive integers (A000027(n)), <code>S(n)</code> sum of digits of n (A007953(n)).
 * @author Georg Fischer
 */
public class A152491 extends FiniteSequence {

  /** Construct the sequence. */
  public A152491() {
    super(2, 4, 6, 8, 18, 72);
  }
}
