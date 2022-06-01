package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021198 Decimal expansion of 1/194.
 * @author Sean A. Irvine
 */
public class A021198 extends PrependSequence {

  /** Construct the sequence. */
  public A021198() {
    super(new PeriodicSequence(0, 5, 1, 5, 4, 6, 3, 9, 1, 7, 5, 2, 5, 7, 7, 3, 1, 9, 5, 8, 7, 6, 2, 8, 8, 6, 5, 9, 7, 9, 3, 8, 1, 4, 4, 3, 2, 9, 8, 9, 6, 9, 0, 7, 2, 1, 6, 4, 9, 4, 8, 4, 5, 3, 6, 0, 8, 2, 4, 7, 4, 2, 2, 6, 8, 0, 4, 1, 2, 3, 7, 1, 1, 3, 4, 0, 2, 0, 6, 1, 8, 5, 5, 6, 7, 0, 1, 0, 3, 0, 9, 2, 7, 8, 3, 5), 0);
  }
}
