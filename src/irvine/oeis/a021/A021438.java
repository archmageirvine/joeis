package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021438 Decimal expansion of 1/434.
 * @author Sean A. Irvine
 */
public class A021438 extends PrependSequence {

  /** Construct the sequence. */
  public A021438() {
    super(new PeriodicSequence(0, 2, 3, 0, 4, 1, 4, 7, 4, 6, 5, 4, 3, 7, 7, 8, 8, 0, 1, 8, 4, 3, 3, 1, 7, 9, 7, 2, 3, 5), 0);
  }
}
