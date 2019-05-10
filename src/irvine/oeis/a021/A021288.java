package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021288 Decimal expansion of 1/284.
 * @author Sean A. Irvine
 */
public class A021288 extends PrependSequence {

  /** Construct the sequence. */
  public A021288() {
    super(new PeriodicSequence(3, 5, 2, 1, 1, 2, 6, 7, 6, 0, 5, 6, 3, 3, 8, 0, 2, 8, 1, 6, 9, 0, 1, 4, 0, 8, 4, 5, 0, 7, 0, 4, 2, 2, 5), 0, 0);
  }
}
