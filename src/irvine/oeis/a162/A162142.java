package irvine.oeis.a162;
// Generated by gen_seq4.pl 2024-07-05/sintrif at 2024-07-05 23:59

import irvine.oeis.a006.A006881;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A162142 Numbers that are the cube of a product of two distinct primes (p^3*q^3).
 * @author Georg Fischer
 */
public class A162142 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A162142() {
    super(1, (term, n) -> term.pow(3), "", new A006881());
  }
}
