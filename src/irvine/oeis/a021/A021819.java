package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021819 Decimal expansion of 1/815.
 * @author Sean A. Irvine
 */
public class A021819 extends PrependSequence {

  /** Construct the sequence. */
  public A021819() {
    super(new PeriodicSequence(0, 1, 2, 2, 6, 9, 9, 3, 8, 6, 5, 0, 3, 0, 6, 7, 4, 8, 4, 6, 6, 2, 5, 7, 6, 6, 8, 7, 1, 1, 6, 5, 6, 4, 4, 1, 7, 1, 7, 7, 9, 1, 4, 1, 1, 0, 4, 2, 9, 4, 4, 7, 8, 5, 2, 7, 6, 0, 7, 3, 6, 1, 9, 6, 3, 1, 9, 0, 1, 8, 4, 0, 4, 9, 0, 7, 9, 7, 5, 4, 6), 0);
  }
}

