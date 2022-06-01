package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021574 Decimal expansion of 1/570.
 * @author Sean A. Irvine
 */
public class A021574 extends PrependSequence {

  /** Construct the sequence. */
  public A021574() {
    super(new PeriodicSequence(0, 1, 7, 5, 4, 3, 8, 5, 9, 6, 4, 9, 1, 2, 2, 8, 0, 7), 0);
  }
}
