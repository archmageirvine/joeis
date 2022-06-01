package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021412 Decimal expansion of 1/408.
 * @author Sean A. Irvine
 */
public class A021412 extends PrependSequence {

  /** Construct the sequence. */
  public A021412() {
    super(new PeriodicSequence(4, 5, 0, 9, 8, 0, 3, 9, 2, 1, 5, 6, 8, 6, 2, 7), 0, 0, 2);
  }
}
