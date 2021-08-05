package irvine.oeis.a100;
// manually 2021-08-04

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a002.A002822;

/**
 * A100923 a(n) = 1 iff 6*n+1 and 6*n-1 are both prime numbers (0 otherwise).
 * @author Georg Fischer
 */
public class A100923 extends CharacteristicFunction {

  /** Construct the sequence */
  public A100923() {
    super(new A002822());
  }
}
