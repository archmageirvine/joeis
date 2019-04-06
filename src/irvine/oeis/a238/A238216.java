package irvine.oeis.a238;

import irvine.oeis.FiniteSequence;

/**
 * A238216 Starting with a(1) = 3, a(2) = 5, a(n+1) is the smallest prime number greater than the previous term a(n) such that there exists k satisfying 1&lt;=k&lt;n, a(n+1) = 2*a(n) + a(k).
 * @author Georg Fischer
 */
public class A238216 extends FiniteSequence {

  /** Construct the sequence. */
  public A238216() {
    super(3, 5, 13, 29, 61, 127, 257, 641, 1409, 2879);
  }
}
