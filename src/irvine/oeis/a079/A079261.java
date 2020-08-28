package irvine.oeis.a079;
// Generated by gen_seq4.pl charfun at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a002.A002145;

/**
 * A079261 Characteristic function of primes of form 4n+3 (1 if n is prime of form 4n+3, 0 otherwise).
 * @author Georg Fischer
 */
public class A079261 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A079261() {
    super(1, new A002145());
  }
}
