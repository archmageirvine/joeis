package irvine.oeis.a158;
// Generated by gen_seq4.pl robots/union2 at 2023-08-23 09:55

import irvine.oeis.UnionSequence;
import irvine.oeis.a062.A062339;
import irvine.oeis.a062.A062343;

/**
 * A158571 Primes whose digit sum is a single-digit nonprime.
 * @author Georg Fischer
 */
public class A158571 extends UnionSequence {

  /** Construct the sequence. */
  public A158571() {
    super(1, new A062339(), new A062343());
  }
}
