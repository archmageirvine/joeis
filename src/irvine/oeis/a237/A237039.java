package irvine.oeis.a237;
// Generated by gen_seq4.pl 2024-07-31/sintrif at 2024-07-31 22:55

import irvine.oeis.transform.SingleTransformSequence;

/**
 * A237039 Semiprimes of the form (2*p)^3 + 1, where p is prime.
 * @author Georg Fischer
 */
public class A237039 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A237039() {
    super(1, (term, n) -> term.multiply(2).pow(3).add(1), "", new A237038());
  }
}
