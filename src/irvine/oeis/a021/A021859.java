package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021859 Decimal expansion of 1/855.
 * @author Sean A. Irvine
 */
public class A021859 extends PrependSequence {

  /** Construct the sequence. */
  public A021859() {
    super(new PeriodicSequence(0, 1, 1, 6, 9, 5, 9, 0, 6, 4, 3, 2, 7, 4, 8, 5, 3, 8), 0);
  }
}

