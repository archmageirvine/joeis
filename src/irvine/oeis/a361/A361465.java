package irvine.oeis.a361;
// Generated by gen_seq4.pl robot/charfun at 2023-05-04 21:32
// DO NOT EDIT here!

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a043.A043305;

/**
 * A361465 a(n) = 1 if A017665(n) [the numerator of the sum of the reciprocals of the divisors of n] is a power of 2, otherwise 0.
 * @author Georg Fischer
 */
public class A361465 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A361465() {
    super(1, new A043305());
  }
}
