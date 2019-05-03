package irvine.oeis.a152;

import irvine.oeis.FiniteSequence;

/**
 * A152491 Numbers n such that <code>1/c = 1/n + 1/S(n)</code>. c, n positive integers <code>(A000027(n)), S(n)</code> sum of digits of <code>n (A007953(n))</code>.
 * @author Georg Fischer
 */
public class A152491 extends FiniteSequence {

  /** Construct the sequence. */
  public A152491() {
    super(2, 4, 6, 8, 18, 72);
  }
}
