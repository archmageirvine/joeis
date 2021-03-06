package irvine.oeis.a080;
// Generated by gen_seq4.pl charfun at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a008.A008578;

/**
 * A080339 Characteristic function of {1} union {primes}: 1 if n is 1 or a prime, else 0.
 * @author Georg Fischer
 */
public class A080339 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A080339() {
    super(1, new A008578());
  }
}
