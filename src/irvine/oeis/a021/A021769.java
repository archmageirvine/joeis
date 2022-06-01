package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021769 Decimal expansion of 1/765.
 * @author Sean A. Irvine
 */
public class A021769 extends PrependSequence {

  /** Construct the sequence. */
  public A021769() {
    super(new PeriodicSequence(0, 1, 3, 0, 7, 1, 8, 9, 5, 4, 2, 4, 8, 3, 6, 6), 0);
  }
}

