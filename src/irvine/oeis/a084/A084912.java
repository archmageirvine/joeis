package irvine.oeis.a084;

import irvine.oeis.FiniteSequence;

/**
 * A084912 a(1) = 1024; a(n) = 5*a(n-1)/8.
 * @author Georg Fischer
 */
public class A084912 extends FiniteSequence {

  /** Construct the sequence. */
  public A084912() {
    super(1, FINITE, 1024, 640, 400, 250);
  }
}
