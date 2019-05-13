package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021730 Decimal expansion of 1/726.
 * @author Sean A. Irvine
 */
public class A021730 extends PrependSequence {

  /** Construct the sequence. */
  public A021730() {
    super(new PeriodicSequence(0, 1, 3, 7, 7, 4, 1, 0, 4, 6, 8, 3, 1, 9, 5, 5, 9, 2, 2, 8, 6, 5), 0);
  }
}

