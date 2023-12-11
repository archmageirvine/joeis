package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021548 Decimal expansion of 1/544.
 * @author Sean A. Irvine
 */
public class A021548 extends PrependSequence {

  /** Construct the sequence. */
  public A021548() {
    super(new PeriodicSequence(8, 2, 3, 5, 2, 9, 4, 1, 1, 7, 6, 4, 7, 0, 5, 8), 0, 0, 1, 8, 3);
  }
}
