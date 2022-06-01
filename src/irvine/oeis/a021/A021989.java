package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021989 Decimal expansion of 1/985.
 * @author Sean A. Irvine
 */
public class A021989 extends PrependSequence {

  /** Construct the sequence. */
  public A021989() {
    super(new PeriodicSequence(0, 1, 0, 1, 5, 2, 2, 8, 4, 2, 6, 3, 9, 5, 9, 3, 9, 0, 8, 6, 2, 9, 4, 4, 1, 6, 2, 4, 3, 6, 5, 4, 8, 2, 2, 3, 3, 5, 0, 2, 5, 3, 8, 0, 7, 1, 0, 6, 5, 9, 8, 9, 8, 4, 7, 7, 1, 5, 7, 3, 6, 0, 4, 0, 6, 0, 9, 1, 3, 7, 0, 5, 5, 8, 3, 7, 5, 6, 3, 4, 5, 1, 7, 7, 6, 6, 4, 9, 7, 4, 6, 1, 9, 2, 8, 9, 3, 4), 0);
  }
}

