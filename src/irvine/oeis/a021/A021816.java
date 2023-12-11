package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021816 Decimal expansion of 1/812.
 * @author Sean A. Irvine
 */
public class A021816 extends PrependSequence {

  /** Construct the sequence. */
  public A021816() {
    super(new PeriodicSequence(1, 2, 3, 1, 5, 2, 7, 0, 9, 3, 5, 9, 6, 0, 5, 9, 1, 1, 3, 3, 0, 0, 4, 9, 2, 6, 1, 0, 8, 3, 7, 4, 3, 8, 4, 2, 3, 6, 4, 5, 3, 2, 0, 1, 9, 7, 0, 4, 4, 3, 3, 4, 9, 7, 5, 3, 6, 9, 4, 5, 8, 1, 2, 8, 0, 7, 8, 8, 1, 7, 7, 3, 3, 9, 9, 0, 1, 4, 7, 7, 8, 3, 2, 5), 0, 0);
  }
}

