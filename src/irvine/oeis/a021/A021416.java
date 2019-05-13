package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021416 Decimal expansion of 1/412.
 * @author Sean A. Irvine
 */
public class A021416 extends PrependSequence {

  /** Construct the sequence. */
  public A021416() {
    super(new PeriodicSequence(2, 4, 2, 7, 1, 8, 4, 4, 6, 6, 0, 1, 9, 4, 1, 7, 4, 7, 5, 7, 2, 8, 1, 5, 5, 3, 3, 9, 8, 0, 5, 8, 2, 5), 0, 0);
  }
}
