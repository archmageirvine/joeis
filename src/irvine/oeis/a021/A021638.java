package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021638 Decimal expansion of 1/634.
 * @author Sean A. Irvine
 */
public class A021638 extends PrependSequence {

  /** Construct the sequence. */
  public A021638() {
    super(new PeriodicSequence(0, 1, 5, 7, 7, 2, 8, 7, 0, 6, 6, 2, 4, 6, 0, 5, 6, 7, 8, 2, 3, 3, 4, 3, 8, 4, 8, 5, 8, 0, 4, 4, 1, 6, 4, 0, 3, 7, 8, 5, 4, 8, 8, 9, 5, 8, 9, 9, 0, 5, 3, 6, 2, 7, 7, 6, 0, 2, 5, 2, 3, 6, 5, 9, 3, 0, 5, 9, 9, 3, 6, 9, 0, 8, 5, 1, 7, 3, 5), 0);
  }
}

