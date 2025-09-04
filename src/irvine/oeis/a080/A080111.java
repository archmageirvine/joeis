package irvine.oeis.a080;

import irvine.oeis.CharacteristicFunction;

/**
 * A080111 Characteristic function of A080113.
 * @author Sean A. Irvine
 */
public class A080111 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A080111() {
    super(1, new A080113());
  }
}
