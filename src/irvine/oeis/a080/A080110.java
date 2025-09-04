package irvine.oeis.a080;

import irvine.oeis.CharacteristicFunction;

/**
 * A080110 Characteristic function of A080112.
 * @author Sean A. Irvine
 */
public class A080110 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A080110() {
    super(1, new A080112());
  }
}
