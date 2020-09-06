package irvine.oeis.a114;
// Manually modified 2020-09-03

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000201;

/**
 * A114986 Characteristic function of (A000201 prefixed with 0).
 * @author Georg Fischer
 */
public class A114986 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A114986() {
    super(0, new PrependSequence(new A000201(), 0));
  }
}
