package irvine.oeis.a134;

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a026.A026905;

/**
 * A134286 Characteristic sequence for sequence A026905.
 * @author Georg Fischer
 */
public class A134286 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A134286() {
    super(1, new A026905());
  }
}
