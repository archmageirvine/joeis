package irvine.oeis.a088;

import irvine.oeis.FiniteSequence;

/**
 * A088097 a(1) = 3, a(n) &gt; 1 is the smallest number == 1 mod (a(n-1)) such that every concatenation is prime.
 * @author Georg Fischer
 */
public class A088097 extends FiniteSequence {

  /** Construct the sequence. */
  public A088097() {
    super(3, 7, 253, 3543);
  }
}
