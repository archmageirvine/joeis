package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021566 Decimal expansion of 1/562.
 * @author Sean A. Irvine
 */
public class A021566 extends PrependSequence {

  /** Construct the sequence. */
  public A021566() {
    super(new PeriodicSequence(0, 1, 7, 7, 9, 3, 5, 9, 4, 3, 0, 6, 0, 4, 9, 8, 2, 2, 0, 6, 4, 0, 5, 6, 9, 3, 9, 5), 0);
  }
}
