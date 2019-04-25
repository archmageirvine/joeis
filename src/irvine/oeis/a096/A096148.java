package irvine.oeis.a096;

import irvine.oeis.FiniteSequence;

/**
 * A096148 Perfect zip primes <code>(i</code>.e., order-k zip primes, with <code>k =</code> number of digits).
 * @author Georg Fischer
 */
public class A096148 extends FiniteSequence {

  /** Construct the sequence. */
  public A096148() {
    super(2, 3, 5, 7, 23, 37, 53, 73, 223, 233, 337, 523, 733, 773, 5233, 33377, 72733, 272333, 572333, 5222333);
  }
}
