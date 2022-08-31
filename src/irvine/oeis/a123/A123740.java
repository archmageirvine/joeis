package irvine.oeis.a123;

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a003.A003623;

/**
 * A123740 Characteristic sequence for Wythoff AB-numbers A003623.
 * @author Georg Fischer
 */
public class A123740 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A123740() {
    super(1, new A003623());
  }
}
