package irvine.oeis.a294;
// manually, charfun at 2021-06-22

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a001.A001608;

/**
 * A294878 Characteristic function for A001608, Perrin sequence.
 * @author Georg Fischer
 */
public class A294878 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A294878() {
    super(0, new A001608(), true, 8);
  }
}
