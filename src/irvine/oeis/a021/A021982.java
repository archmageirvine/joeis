package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021982 Decimal expansion of 1/978.
 * @author Sean A. Irvine
 */
public class A021982 extends PrependSequence {

  /** Construct the sequence. */
  public A021982() {
    super(new PeriodicSequence(0, 1, 0, 2, 2, 4, 9, 4, 8, 8, 7, 5, 2, 5, 5, 6, 2, 3, 7, 2, 1, 8, 8, 1, 3, 9, 0, 5, 9, 3, 0, 4, 7, 0, 3, 4, 7, 6, 4, 8, 2, 6, 1, 7, 5, 8, 6, 9, 1, 2, 0, 6, 5, 4, 3, 9, 6, 7, 2, 8, 0, 1, 6, 3, 5, 9, 9, 1, 8, 2, 0, 0, 4, 0, 8, 9, 9, 7, 9, 5, 5), 0);
  }
}

