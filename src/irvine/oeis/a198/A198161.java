package irvine.oeis.a198;
// Generated by gen_seq4.pl primerg at 2022-04-10 16:39

import irvine.oeis.a002.A002193;
import irvine.oeis.a103.A103812;

/**
 * A198161 Primes from merging of 10 successive digits in decimal expansion of sqrt(2).
 * @author Georg Fischer
 */
public class A198161 extends A103812 {

  /** Construct the sequence. */
  public A198161() {
    super(new A002193(), 10, 1);
  }
}
