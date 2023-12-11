package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021888 Decimal expansion of 1/884.
 * @author Sean A. Irvine
 */
public class A021888 extends PrependSequence {

  /** Construct the sequence. */
  public A021888() {
    super(new PeriodicSequence(1, 1, 3, 1, 2, 2, 1, 7, 1, 9, 4, 5, 7, 0, 1, 3, 5, 7, 4, 6, 6, 0, 6, 3, 3, 4, 8, 4, 1, 6, 2, 8, 9, 5, 9, 2, 7, 6, 0, 1, 8, 0, 9, 9, 5, 4, 7, 5), 0, 0);
  }
}

