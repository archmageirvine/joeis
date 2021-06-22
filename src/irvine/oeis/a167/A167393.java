package irvine.oeis.a167;
// manually 2021-06-22

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a000.A000009;

/**
 * A167393 Characteristic function of the range of A000009.
 * @author Georg Fischer
 */

public class A167393 extends CharacteristicFunction {
    
  /** Construct the sequence */
  public A167393() {
    super(0, new A000009(), true, 10);
  }
}
