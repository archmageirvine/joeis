package irvine.oeis.a101;
// Generated by gen_seq4.pl charfun at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a014.A014612;

/**
 * A101605 a(n) = 1 if n is a product of exactly 3 (not necessarily distinct) primes, otherwise 0.
 * @author Georg Fischer
 */
public class A101605 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A101605() {
    super(1, new A014612());
  }
}
