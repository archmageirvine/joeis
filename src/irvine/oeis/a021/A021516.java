package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021516 Decimal expansion of 1/512.
 * @author Sean A. Irvine
 */
public class A021516 extends PrependSequence {

  /** Construct the sequence. */
  public A021516() {
    super(new PeriodicSequence(0), 0, 0, 1, 9, 5, 3, 1, 2, 5);
  }
}
