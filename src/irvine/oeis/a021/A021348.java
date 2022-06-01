package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021348 Decimal expansion of 1/344.
 * @author Sean A. Irvine
 */
public class A021348 extends PrependSequence {

  /** Construct the sequence. */
  public A021348() {
    super(new PeriodicSequence(9, 0, 6, 9, 7, 6, 7, 4, 4, 1, 8, 6, 0, 4, 6, 5, 1, 1, 6, 2, 7), 0, 0, 2);
  }
}
