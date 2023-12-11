package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021239 Decimal expansion of 1/235.
 * @author Sean A. Irvine
 */
public class A021239 extends PrependSequence {

  /** Construct the sequence. */
  public A021239() {
    super(new PeriodicSequence(0, 4, 2, 5, 5, 3, 1, 9, 1, 4, 8, 9, 3, 6, 1, 7, 0, 2, 1, 2, 7, 6, 5, 9, 5, 7, 4, 4, 6, 8, 0, 8, 5, 1, 0, 6, 3, 8, 2, 9, 7, 8, 7, 2, 3, 4), 0);
  }
}
