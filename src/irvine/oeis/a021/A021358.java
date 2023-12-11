package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021358 Decimal expansion of 1/354.
 * @author Sean A. Irvine
 */
public class A021358 extends PrependSequence {

  /** Construct the sequence. */
  public A021358() {
    super(new PeriodicSequence(0, 2, 8, 2, 4, 8, 5, 8, 7, 5, 7, 0, 6, 2, 1, 4, 6, 8, 9, 2, 6, 5, 5, 3, 6, 7, 2, 3, 1, 6, 3, 8, 4, 1, 8, 0, 7, 9, 0, 9, 6, 0, 4, 5, 1, 9, 7, 7, 4, 0, 1, 1, 2, 9, 9, 4, 3, 5), 0);
  }
}
