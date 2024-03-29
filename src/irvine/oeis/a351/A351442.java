package irvine.oeis.a351;
// Generated by gen_seq4.pl dirtraf at 2023-11-18 23:07

import irvine.oeis.a000.A000203;
import irvine.oeis.a003.A003958;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A351442 a(n) = A003958(sigma(n)), where A003958 is multiplicative with a(p^e) = (p-1)^e and sigma is the sum of divisors function.
 * @author Georg Fischer
 */
public class A351442 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A351442() {
    super(1, new A003958(), new A000203());
  }
}
