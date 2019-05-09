package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021246 Decimal expansion of 1/242.
 * @author Sean A. Irvine
 */
public class A021246 extends PrependSequence {

  /** Construct the sequence. */
  public A021246() {
    super(new PeriodicSequence(0, 4, 1, 3, 2, 2, 3, 1, 4, 0, 4, 9, 5, 8, 6, 7, 7, 6, 8, 5, 9, 5), 0);
  }
}
