package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021429 Decimal expansion of 1/425.
 * @author Sean A. Irvine
 */
public class A021429 extends PrependSequence {

  /** Construct the sequence. */
  public A021429() {
    super(new PeriodicSequence(2, 3, 5, 2, 9, 4, 1, 1, 7, 6, 4, 7, 0, 5, 8, 8), 0, 0);
  }
}
