package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021702 Decimal expansion of 1/698.
 * @author Sean A. Irvine
 */
public class A021702 extends PrependSequence {

  /** Construct the sequence. */
  public A021702() {
    super(new PeriodicSequence(0, 1, 4, 3, 2, 6, 6, 4, 7, 5, 6, 4, 4, 6, 9, 9, 1, 4, 0, 4, 0, 1, 1, 4, 6, 1, 3, 1, 8, 0, 5, 1, 5, 7, 5, 9, 3, 1, 2, 3, 2, 0, 9, 1, 6, 9, 0, 5, 4, 4, 4, 1, 2, 6, 0, 7, 4, 4, 9, 8, 5, 6, 7, 3, 3, 5, 2, 4, 3, 5, 5, 3, 0, 0, 8, 5, 9, 5, 9, 8, 8, 5, 3, 8, 6, 8, 1, 9, 4, 8, 4, 2, 4, 0, 6, 8, 7, 6, 7, 9, 0, 8, 3, 0, 9, 4, 5, 5, 5, 8, 7, 3, 9, 2, 5, 5), 0);
  }
}

