package irvine.oeis.a238;

import irvine.oeis.FiniteSequence;

/**
 * A238216 Starting with <code>a(1) = 3, a(2) = 5, a(n+1)</code> is the smallest prime number greater than the previous term <code>a(n)</code> such that there exists k satisfying 1&lt;=k&lt;n, <code>a(n+1) = 2*a(n) +</code> a(k).
 * @author Georg Fischer
 */
public class A238216 extends FiniteSequence {

  /** Construct the sequence. */
  public A238216() {
    super(3, 5, 13, 29, 61, 127, 257, 641, 1409, 2879);
  }
}
