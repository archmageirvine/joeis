package irvine.oeis.a214;

import irvine.oeis.FiniteSequence;

/**
 * A214285 List of amicable sums-of-factorial-of-digits pairs (A,B): A equals the sum of the factorials of B's digits in base 10, and vice versa.
 * @author Georg Fischer
 */
public class A214285 extends FiniteSequence {

  /** Construct the sequence. */
  public A214285() {
    super(1, FINITE, 871, 45361, 872, 45362);
  }
}
