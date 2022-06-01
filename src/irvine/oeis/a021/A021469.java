package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021469 Decimal expansion of 1/465.
 * @author Sean A. Irvine
 */
public class A021469 extends PrependSequence {

  /** Construct the sequence. */
  public A021469() {
    super(new PeriodicSequence(0, 2, 1, 5, 0, 5, 3, 7, 6, 3, 4, 4, 0, 8, 6), 0);
  }
}
