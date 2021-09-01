package irvine.oeis.a164;
// manually 2021-08-04

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a001.A001097;

/**
 * A164292 Binary sequence identifying the twin primes (characteristic function of twin primes: 1 if n is a twin prime else 0).
 * @author Georg Fischer
 */
public class A164292 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A164292() {
    super(new A001097());
  }
}
