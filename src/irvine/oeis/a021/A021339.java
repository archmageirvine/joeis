package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021339 Decimal expansion of 1/335.
 * @author Sean A. Irvine
 */
public class A021339 extends PrependSequence {

  /** Construct the sequence. */
  public A021339() {
    super(new PeriodicSequence(0, 2, 9, 8, 5, 0, 7, 4, 6, 2, 6, 8, 6, 5, 6, 7, 1, 6, 4, 1, 7, 9, 1, 0, 4, 4, 7, 7, 6, 1, 1, 9, 4), 0);
  }
}
