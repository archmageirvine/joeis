package irvine.oeis.a276;
// Generated by gen_seq4.pl 2025-07-11.ack/prepend at 2025-07-11 21:53

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.PrependSequence;
import irvine.oeis.a003.A003145;

/**
 * A276794 Indicator function for A003145.
 * @author Georg Fischer
 */
public class A276794 extends PrependSequence {

  /** Construct the sequence. */
  public A276794() {
    super(0, new CharacteristicFunction(1, new A003145()), 0);
  }
}
