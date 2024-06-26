package irvine.oeis.a341;
// Generated by gen_seq4.pl 2024-04-29/ordsum at 2024-04-29 22:09

import irvine.oeis.a080.A080339;
import irvine.oeis.transform.RootSequence;

/**
 * A341984 Number of ways to write n as an ordered sum of 5 primes (counting 1 as a prime).
 * @author Georg Fischer
 */
public class A341984 extends RootSequence {

  /** Construct the sequence. */
  public A341984() {
    super(5, new A080339().skip(), 5, 1);
  }
}
