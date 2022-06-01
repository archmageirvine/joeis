package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021856 Decimal expansion of 1/852.
 * @author Sean A. Irvine
 */
public class A021856 extends PrependSequence {

  /** Construct the sequence. */
  public A021856() {
    super(new PeriodicSequence(1, 1, 7, 3, 7, 0, 8, 9, 2, 0, 1, 8, 7, 7, 9, 3, 4, 2, 7, 2, 3, 0, 0, 4, 6, 9, 4, 8, 3, 5, 6, 8, 0, 7, 5), 0, 0);
  }
}

