package irvine.oeis.a285;

import irvine.oeis.FiniteSequence;

/**
 * A285528 Numbers n such that A217723(n) (sum of first n primorial numbers minus <code>1)</code> is prime.
 * @author Georg Fischer
 */
public class A285528 extends FiniteSequence {

  /** Construct the sequence. */
  public A285528() {
    super(2, 3, 5, 6, 7, 8, 11, 14, 21, 41, 42, 43, 74, 78);
  }
}
