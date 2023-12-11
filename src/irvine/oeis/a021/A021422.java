package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021422 Decimal expansion of 1/418.
 * @author Sean A. Irvine
 */
public class A021422 extends PrependSequence {

  /** Construct the sequence. */
  public A021422() {
    super(new PeriodicSequence(0, 2, 3, 9, 2, 3, 4, 4, 4, 9, 7, 6, 0, 7, 6, 5, 5, 5), 0);
  }
}
