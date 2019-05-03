package irvine.oeis.a214;

import irvine.oeis.FiniteSequence;

/**
 * A214285 List of amicable <code>sums-of-factorial-of-digits</code> pairs <code>(A,B)</code>: A equals the sum of the factorials of B's digits in base 10, and vice versa.
 * @author Georg Fischer
 */
public class A214285 extends FiniteSequence {

  /** Construct the sequence. */
  public A214285() {
    super(871, 45361, 872, 45362);
  }
}
