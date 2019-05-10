package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021352 Decimal expansion of 1/348.
 * @author Sean A. Irvine
 */
public class A021352 extends PrependSequence {

  /** Construct the sequence. */
  public A021352() {
    super(new PeriodicSequence(2, 8, 7, 3, 5, 6, 3, 2, 1, 8, 3, 9, 0, 8, 0, 4, 5, 9, 7, 7, 0, 1, 1, 4, 9, 4, 2, 5), 0, 0);
  }
}
