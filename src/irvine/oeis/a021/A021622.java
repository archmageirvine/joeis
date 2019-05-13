package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021622 Decimal expansion of 1/618.
 * @author Sean A. Irvine
 */
public class A021622 extends PrependSequence {

  /** Construct the sequence. */
  public A021622() {
    super(new PeriodicSequence(0, 1, 6, 1, 8, 1, 2, 2, 9, 7, 7, 3, 4, 6, 2, 7, 8, 3, 1, 7, 1, 5, 2, 1, 0, 3, 5, 5, 9, 8, 7, 0, 5, 5), 0);
  }
}

