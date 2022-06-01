package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021232 Decimal expansion of 1/228.
 * @author Sean A. Irvine
 */
public class A021232 extends PrependSequence {

  /** Construct the sequence. */
  public A021232() {
    super(new PeriodicSequence(4, 3, 8, 5, 9, 6, 4, 9, 1, 2, 2, 8, 0, 7, 0, 1, 7, 5), 0, 0);
  }
}
