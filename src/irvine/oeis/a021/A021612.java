package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021612 Decimal expansion of 1/608.
 * @author Sean A. Irvine
 */
public class A021612 extends PrependSequence {

  /** Construct the sequence. */
  public A021612() {
    super(new PeriodicSequence(4, 7, 3, 6, 8, 4, 2, 1, 0, 5, 2, 6, 3, 1, 5, 7, 8, 9), 0, 0, 1, 6, 4);
  }
}

