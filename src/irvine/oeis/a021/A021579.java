package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021579 Decimal expansion of 1/575.
 * @author Sean A. Irvine
 */
public class A021579 extends PrependSequence {

  /** Construct the sequence. */
  public A021579() {
    super(new PeriodicSequence(1, 7, 3, 9, 1, 3, 0, 4, 3, 4, 7, 8, 2, 6, 0, 8, 6, 9, 5, 6, 5, 2), 0, 0);
  }
}
