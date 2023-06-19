package irvine.oeis.a211;
// Manually modified 2020-09-03

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.PrependSequence;
import irvine.oeis.a033.A033948;

/**
 * A211487 Characteristic sequence of numbers n having a primitive root modulo n.
 * @author Georg Fischer
 */
public class A211487 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A211487() {
    super(1, new PrependSequence(new A033948().skip(1), 0));
  }
}
