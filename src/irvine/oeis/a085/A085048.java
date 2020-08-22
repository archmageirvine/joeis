package irvine.oeis.a085;

import irvine.oeis.FiniteSequence;

/**
 * A085048 a(2n-1) is odd, a(2n) = even, such that the difference of two terms with different parity is a prime.
 * @author Georg Fischer
 */
public class A085048 extends FiniteSequence {

  /** Construct the sequence. */
  public A085048() {
    super(1, 4, 7, 12, 15, 18, 23);
  }
}
