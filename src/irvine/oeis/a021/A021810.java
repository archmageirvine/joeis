package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021810 Decimal expansion of 1/806.
 * @author Sean A. Irvine
 */
public class A021810 extends PrependSequence {

  /** Construct the sequence. */
  public A021810() {
    super(new PeriodicSequence(0, 1, 2, 4, 0, 6, 9, 4, 7, 8, 9, 0, 8, 1, 8, 8, 5, 8, 5, 6, 0, 7, 9, 4, 0, 4, 4, 6, 6, 5), 0);
  }
}

