package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021468 Decimal expansion of 1/464.
 * @author Sean A. Irvine
 */
public class A021468 extends PrependSequence {

  /** Construct the sequence. */
  public A021468() {
    super(new PeriodicSequence(5, 5, 1, 7, 2, 4, 1, 3, 7, 9, 3, 1, 0, 3, 4, 4, 8, 2, 7, 5, 8, 6, 2, 0, 6, 8, 9, 6), 0, 0, 2, 1);
  }
}
