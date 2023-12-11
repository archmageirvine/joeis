package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021432 Decimal expansion of 1/428.
 * @author Sean A. Irvine
 */
public class A021432 extends PrependSequence {

  /** Construct the sequence. */
  public A021432() {
    super(new PeriodicSequence(2, 3, 3, 6, 4, 4, 8, 5, 9, 8, 1, 3, 0, 8, 4, 1, 1, 2, 1, 4, 9, 5, 3, 2, 7, 1, 0, 2, 8, 0, 3, 7, 3, 8, 3, 1, 7, 7, 5, 7, 0, 0, 9, 3, 4, 5, 7, 9, 4, 3, 9, 2, 5), 0, 0);
  }
}
