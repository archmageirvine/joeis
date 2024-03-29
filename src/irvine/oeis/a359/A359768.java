package irvine.oeis.a359;
// Generated by gen_seq4.pl robot/charfun at 2023-05-04 21:32
// DO NOT EDIT here!

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a036.A036347;

/**
 * A359768 a(n) = 1 if the parity of n and that of sopfr(n) differ, otherwise 0. Here sopfr is the sum of prime factors (with repetition).
 * @author Georg Fischer
 */
public class A359768 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A359768() {
    super(1, new A036347());
  }
}
