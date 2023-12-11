package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021500 Decimal expansion of 1/496.
 * @author Sean A. Irvine
 */
public class A021500 extends PrependSequence {

  /** Construct the sequence. */
  public A021500() {
    super(new PeriodicSequence(1, 6, 1, 2, 9, 0, 3, 2, 2, 5, 8, 0, 6, 4, 5), 0, 0, 2, 0);
  }
}
