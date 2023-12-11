package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021309 Decimal expansion of 1/305.
 * @author Sean A. Irvine
 */
public class A021309 extends PrependSequence {

  /** Construct the sequence. */
  public A021309() {
    super(new PeriodicSequence(0, 3, 2, 7, 8, 6, 8, 8, 5, 2, 4, 5, 9, 0, 1, 6, 3, 9, 3, 4, 4, 2, 6, 2, 2, 9, 5, 0, 8, 1, 9, 6, 7, 2, 1, 3, 1, 1, 4, 7, 5, 4, 0, 9, 8, 3, 6, 0, 6, 5, 5, 7, 3, 7, 7, 0, 4, 9, 1, 8), 0);
  }
}
