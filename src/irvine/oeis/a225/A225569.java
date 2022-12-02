package irvine.oeis.a225;

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a024.A024023;

/**
 * A225569 Decimal expansion of Sum_{n>=0} 1/10^(3^n), a transcendental number.
 * @author Georg Fischer
 */
public class A225569 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A225569() {
    super(0, new A024023(), true, 4);
  }
}
