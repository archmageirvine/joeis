package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021808 Decimal expansion of 1/804.
 * @author Sean A. Irvine
 */
public class A021808 extends PrependSequence {

  /** Construct the sequence. */
  public A021808() {
    super(new PeriodicSequence(1, 2, 4, 3, 7, 8, 1, 0, 9, 4, 5, 2, 7, 3, 6, 3, 1, 8, 4, 0, 7, 9, 6, 0, 1, 9, 9, 0, 0, 4, 9, 7, 5), 0, 0);
  }
}

