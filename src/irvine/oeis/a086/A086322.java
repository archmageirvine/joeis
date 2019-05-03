package irvine.oeis.a086;

import irvine.oeis.FiniteSequence;

/**
 * A086322 Primes produced by repeated application of the formula p <code>-&gt; (10p +- 3)</code> starting at the prime 2.
 * @author Georg Fischer
 */
public class A086322 extends FiniteSequence {

  /** Construct the sequence. */
  public A086322() {
    super(2, 17, 23, 167, 173, 227, 233, 1667, 1733, 2267, 2273, 2333, 16673, 17327, 17333, 22727, 23327, 23333, 173267, 173273, 227267, 233267, 233327, 1732727, 2272667, 2332667, 22726667, 23326673);
  }
}
