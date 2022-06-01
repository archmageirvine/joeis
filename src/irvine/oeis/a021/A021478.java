package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021478 Decimal expansion of 1/474.
 * @author Sean A. Irvine
 */
public class A021478 extends PrependSequence {

  /** Construct the sequence. */
  public A021478() {
    super(new PeriodicSequence(0, 2, 1, 0, 9, 7, 0, 4, 6, 4, 1, 3, 5), 0);
  }
}
