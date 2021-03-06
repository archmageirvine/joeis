package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021472 Decimal expansion of 1/468.
 * @author Sean A. Irvine
 */
public class A021472 extends PrependSequence {

  /** Construct the sequence. */
  public A021472() {
    super(new PeriodicSequence(2, 1, 3, 6, 7, 5), 0, 0);
  }
}
