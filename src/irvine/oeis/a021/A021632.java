package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021632 Decimal expansion of 1/628.
 * @author Sean A. Irvine
 */
public class A021632 extends PrependSequence {

  /** Construct the sequence. */
  public A021632() {
    super(new PeriodicSequence(1, 5, 9, 2, 3, 5, 6, 6, 8, 7, 8, 9, 8, 0, 8, 9, 1, 7, 1, 9, 7, 4, 5, 2, 2, 2, 9, 2, 9, 9, 3, 6, 3, 0, 5, 7, 3, 2, 4, 8, 4, 0, 7, 6, 4, 3, 3, 1, 2, 1, 0, 1, 9, 1, 0, 8, 2, 8, 0, 2, 5, 4, 7, 7, 7, 0, 7, 0, 0, 6, 3, 6, 9, 4, 2, 6, 7, 5), 0, 0);
  }
}

