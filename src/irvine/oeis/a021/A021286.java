package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021286 Decimal expansion of 1/282.
 * @author Sean A. Irvine
 */
public class A021286 extends PrependSequence {

  /** Construct the sequence. */
  public A021286() {
    super(new PeriodicSequence(0, 3, 5, 4, 6, 0, 9, 9, 2, 9, 0, 7, 8, 0, 1, 4, 1, 8, 4, 3, 9, 7, 1, 6, 3, 1, 2, 0, 5, 6, 7, 3, 7, 5, 8, 8, 6, 5, 2, 4, 8, 2, 2, 6, 9, 5), 0);
  }
}
