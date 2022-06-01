package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021922 Decimal expansion of 1/918.
 * @author Sean A. Irvine
 */
public class A021922 extends PrependSequence {

  /** Construct the sequence. */
  public A021922() {
    super(new PeriodicSequence(0, 1, 0, 8, 9, 3, 2, 4, 6, 1, 8, 7, 3, 6, 3, 8, 3, 4, 4, 2, 2, 6, 5, 7, 9, 5, 2, 0, 6, 9, 7, 1, 6, 7, 7, 5, 5, 9, 9, 1, 2, 8, 5, 4, 0, 3, 0, 5), 0);
  }
}

