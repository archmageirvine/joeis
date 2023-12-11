package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021560 Decimal expansion of 1/556.
 * @author Sean A. Irvine
 */
public class A021560 extends PrependSequence {

  /** Construct the sequence. */
  public A021560() {
    super(new PeriodicSequence(1, 7, 9, 8, 5, 6, 1, 1, 5, 1, 0, 7, 9, 1, 3, 6, 6, 9, 0, 6, 4, 7, 4, 8, 2, 0, 1, 4, 3, 8, 8, 4, 8, 9, 2, 0, 8, 6, 3, 3, 0, 9, 3, 5, 2, 5), 0, 0);
  }
}
