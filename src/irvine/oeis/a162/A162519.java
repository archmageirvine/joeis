package irvine.oeis.a162;
// Manually modified 2020-09-03

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a018.A018226;

/**
 * A162519 Characteristic function of magic numbers A018226: 0 if n is a magic number else 1.
 * @author Georg Fischer
 */
public class A162519 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A162519() {
    super(1, new A018226(), false);
  }
}
