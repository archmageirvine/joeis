package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021119 Decimal expansion of 1/115.
 * @author Sean A. Irvine
 */
public class A021119 extends PrependSequence {

  /** Construct the sequence. */
  public A021119() {
    super(new PeriodicSequence(0, 8, 6, 9, 5, 6, 5, 2, 1, 7, 3, 9, 1, 3, 0, 4, 3, 4, 7, 8, 2, 6), 0);
  }
}
