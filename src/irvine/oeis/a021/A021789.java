package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021789 Decimal expansion of 1/785.
 * @author Sean A. Irvine
 */
public class A021789 extends PrependSequence {

  /** Construct the sequence. */
  public A021789() {
    super(new PeriodicSequence(0, 1, 2, 7, 3, 8, 8, 5, 3, 5, 0, 3, 1, 8, 4, 7, 1, 3, 3, 7, 5, 7, 9, 6, 1, 7, 8, 3, 4, 3, 9, 4, 9, 0, 4, 4, 5, 8, 5, 9, 8, 7, 2, 6, 1, 1, 4, 6, 4, 9, 6, 8, 1, 5, 2, 8, 6, 6, 2, 4, 2, 0, 3, 8, 2, 1, 6, 5, 6, 0, 5, 0, 9, 5, 5, 4, 1, 4), 0);
  }
}

