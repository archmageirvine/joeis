package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021488 Decimal expansion of 1/484.
 * @author Sean A. Irvine
 */
public class A021488 extends PrependSequence {

  /** Construct the sequence. */
  public A021488() {
    super(new PeriodicSequence(2, 0, 6, 6, 1, 1, 5, 7, 0, 2, 4, 7, 9, 3, 3, 8, 8, 4, 2, 9, 7, 5), 0, 0);
  }
}
