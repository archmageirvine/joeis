package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021346 Decimal expansion of 1/342.
 * @author Sean A. Irvine
 */
public class A021346 extends PrependSequence {

  /** Construct the sequence. */
  public A021346() {
    super(new PeriodicSequence(0, 2, 9, 2, 3, 9, 7, 6, 6, 0, 8, 1, 8, 7, 1, 3, 4, 5), 0);
  }
}
