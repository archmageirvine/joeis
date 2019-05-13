package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021766 Decimal expansion of 1/762.
 * @author Sean A. Irvine
 */
public class A021766 extends PrependSequence {

  /** Construct the sequence. */
  public A021766() {
    super(new PeriodicSequence(0, 1, 3, 1, 2, 3, 3, 5, 9, 5, 8, 0, 0, 5, 2, 4, 9, 3, 4, 3, 8, 3, 2, 0, 2, 0, 9, 9, 7, 3, 7, 5, 3, 2, 8, 0, 8, 3, 9, 8, 9, 5), 0);
  }
}

