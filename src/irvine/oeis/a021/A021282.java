package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021282 Decimal expansion of 1/278.
 * @author Sean A. Irvine
 */
public class A021282 extends PrependSequence {

  /** Construct the sequence. */
  public A021282() {
    super(new PeriodicSequence(0, 3, 5, 9, 7, 1, 2, 2, 3, 0, 2, 1, 5, 8, 2, 7, 3, 3, 8, 1, 2, 9, 4, 9, 6, 4, 0, 2, 8, 7, 7, 6, 9, 7, 8, 4, 1, 7, 2, 6, 6, 1, 8, 7, 0, 5), 0);
  }
}
