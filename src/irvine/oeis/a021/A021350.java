package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021350 Decimal expansion of 1/346.
 * @author Sean A. Irvine
 */
public class A021350 extends PrependSequence {

  /** Construct the sequence. */
  public A021350() {
    super(new PeriodicSequence(0, 2, 8, 9, 0, 1, 7, 3, 4, 1, 0, 4, 0, 4, 6, 2, 4, 2, 7, 7, 4, 5, 6, 6, 4, 7, 3, 9, 8, 8, 4, 3, 9, 3, 0, 6, 3, 5, 8, 3, 8, 1, 5), 0);
  }
}
