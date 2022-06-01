package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021299 Decimal expansion of 1/295.
 * @author Sean A. Irvine
 */
public class A021299 extends PrependSequence {

  /** Construct the sequence. */
  public A021299() {
    super(new PeriodicSequence(0, 3, 3, 8, 9, 8, 3, 0, 5, 0, 8, 4, 7, 4, 5, 7, 6, 2, 7, 1, 1, 8, 6, 4, 4, 0, 6, 7, 7, 9, 6, 6, 1, 0, 1, 6, 9, 4, 9, 1, 5, 2, 5, 4, 2, 3, 7, 2, 8, 8, 1, 3, 5, 5, 9, 3, 2, 2), 0);
  }
}
