package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021699 Decimal expansion of 1/695.
 * @author Sean A. Irvine
 */
public class A021699 extends PrependSequence {

  /** Construct the sequence. */
  public A021699() {
    super(new PeriodicSequence(0, 1, 4, 3, 8, 8, 4, 8, 9, 2, 0, 8, 6, 3, 3, 0, 9, 3, 5, 2, 5, 1, 7, 9, 8, 5, 6, 1, 1, 5, 1, 0, 7, 9, 1, 3, 6, 6, 9, 0, 6, 4, 7, 4, 8, 2), 0);
  }
}

