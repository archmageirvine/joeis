package irvine.oeis.a353;
// manually 2023-01-10

import irvine.oeis.a002.A002275;
import irvine.oeis.a204.A204574;

/**
 * A353143 Decimal repunits written in base 4.
 * @author Georg Fischer
 */
public class A353143 extends A204574 {

  /** Construct the sequence. */
  public A353143() {
    super(0, new A002275(), 4);
  }
}
