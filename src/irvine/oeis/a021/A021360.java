package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021360 Decimal expansion of 1/356.
 * @author Sean A. Irvine
 */
public class A021360 extends PrependSequence {

  /** Construct the sequence. */
  public A021360() {
    super(new PeriodicSequence(2, 8, 0, 8, 9, 8, 8, 7, 6, 4, 0, 4, 4, 9, 4, 3, 8, 2, 0, 2, 2, 4, 7, 1, 9, 1, 0, 1, 1, 2, 3, 5, 9, 5, 5, 0, 5, 6, 1, 7, 9, 7, 7, 5), 0, 0);
  }
}
