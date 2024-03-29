package irvine.oeis.a341;
// Generated by gen_seq4.pl charfun at 2023-09-18 22:41
// DO NOT EDIT here!

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a157.A157037;

/**
 * A341995 a(n) = 1 if the arithmetic derivative (A003415) of n is a prime, otherwise 0.
 * @author Georg Fischer
 */
public class A341995 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A341995() {
    super(0, new A157037());
  }
}
