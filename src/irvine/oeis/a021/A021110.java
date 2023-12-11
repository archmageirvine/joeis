package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021110 Decimal expansion of 1/106.
 * @author Sean A. Irvine
 */
public class A021110 extends PrependSequence {

  /** Construct the sequence. */
  public A021110() {
    super(new PeriodicSequence(0, 9, 4, 3, 3, 9, 6, 2, 2, 6, 4, 1, 5), 0);
  }
}
