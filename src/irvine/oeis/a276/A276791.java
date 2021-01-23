package irvine.oeis.a276;
// Manually modified 2020-09-03

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.PrependSequence;
import irvine.oeis.a003.A003146;

/**
 * A276791 Indicator function of (A003146 prefixed with 0).
 * @author Georg Fischer
 */
public class A276791 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A276791() {
    super(0, new PrependSequence(new A003146(), 0));
  }
}
