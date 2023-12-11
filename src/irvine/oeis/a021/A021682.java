package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021682 Decimal expansion of 1/678.
 * @author Sean A. Irvine
 */
public class A021682 extends PrependSequence {

  /** Construct the sequence. */
  public A021682() {
    super(new PeriodicSequence(0, 1, 4, 7, 4, 9, 2, 6, 2, 5, 3, 6, 8, 7, 3, 1, 5, 6, 3, 4, 2, 1, 8, 2, 8, 9, 0, 8, 5, 5, 4, 5, 7, 2, 2, 7, 1, 3, 8, 6, 4, 3, 0, 6, 7, 8, 4, 6, 6, 0, 7, 6, 6, 9, 6, 1, 6, 5, 1, 9, 1, 7, 4, 0, 4, 1, 2, 9, 7, 9, 3, 5, 1, 0, 3, 2, 4, 4, 8, 3, 7, 7, 5, 8, 1, 1, 2, 0, 9, 4, 3, 9, 5, 2, 8, 0, 2, 3, 5, 9, 8, 8, 2, 0, 0, 5, 8, 9, 9, 7, 0, 5), 0);
  }
}

