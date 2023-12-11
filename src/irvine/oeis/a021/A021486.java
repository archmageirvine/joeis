package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021486 Decimal expansion of 1/482.
 * @author Sean A. Irvine
 */
public class A021486 extends PrependSequence {

  /** Construct the sequence. */
  public A021486() {
    super(new PeriodicSequence(0, 2, 0, 7, 4, 6, 8, 8, 7, 9, 6, 6, 8, 0, 4, 9, 7, 9, 2, 5, 3, 1, 1, 2, 0, 3, 3, 1, 9, 5), 0);
  }
}
