package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021336 Decimal expansion of 1/332.
 * @author Sean A. Irvine
 */
public class A021336 extends PrependSequence {

  /** Construct the sequence. */
  public A021336() {
    super(new PeriodicSequence(3, 0, 1, 2, 0, 4, 8, 1, 9, 2, 7, 7, 1, 0, 8, 4, 3, 3, 7, 3, 4, 9, 3, 9, 7, 5, 9, 0, 3, 6, 1, 4, 4, 5, 7, 8, 3, 1, 3, 2, 5), 0, 0);
  }
}
