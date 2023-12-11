package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021806 Decimal expansion of 1/802.
 * @author Sean A. Irvine
 */
public class A021806 extends PrependSequence {

  /** Construct the sequence. */
  public A021806() {
    super(new PeriodicSequence(0, 1, 2, 4, 6, 8, 8, 2, 7, 9, 3, 0, 1, 7, 4, 5, 6, 3, 5, 9, 1, 0, 2, 2, 4, 4, 3, 8, 9, 0, 2, 7, 4, 3, 1, 4, 2, 1, 4, 4, 6, 3, 8, 4, 0, 3, 9, 9, 0, 0, 2, 4, 9, 3, 7, 6, 5, 5, 8, 6, 0, 3, 4, 9, 1, 2, 7, 1, 8, 2, 0, 4, 4, 8, 8, 7, 7, 8, 0, 5, 4, 8, 6, 2, 8, 4, 2, 8, 9, 2, 7, 6, 8, 0, 7, 9, 8, 0, 0, 4, 9, 8, 7, 5, 3, 1, 1, 7, 2, 0, 6, 9, 8, 2, 5, 4, 3, 6, 4, 0, 8, 9, 7, 7, 5, 5, 6, 1, 0, 9, 7, 2, 5, 6, 8, 5, 7, 8, 5, 5, 3, 6, 1, 5, 9, 6, 0, 0, 9, 9, 7, 5, 0, 6, 2, 3, 4, 4, 1, 3, 9, 6, 5, 0, 8, 7, 2, 8, 1, 7, 9, 5, 5, 1, 1, 2, 2, 1, 9, 4, 5, 1, 3, 7, 1, 5, 7, 1, 0, 7, 2, 3, 1, 9, 2, 0, 1, 9, 9, 5), 0);
  }
}

