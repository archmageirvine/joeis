package irvine.oeis.a085;

import irvine.oeis.FiniteSequence;

/**
 * A085048 <code>a(2n-1)</code> is odd, <code>a(2n) =</code> even, such that the difference of two terms with different parity is a prime.
 * @author Georg Fischer
 */
public class A085048 extends FiniteSequence {

  /** Construct the sequence. */
  public A085048() {
    super(1, 4, 7, 12, 15, 18, 23);
  }
}
