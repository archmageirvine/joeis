package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021942 Decimal expansion of 1/938.
 * @author Sean A. Irvine
 */
public class A021942 extends PrependSequence {

  /** Construct the sequence. */
  public A021942() {
    super(new PeriodicSequence(0, 1, 0, 6, 6, 0, 9, 8, 0, 8, 1, 0, 2, 3, 4, 5, 4, 1, 5, 7, 7, 8, 2, 5, 1, 5, 9, 9, 1, 4, 7, 1, 2, 1, 5, 3, 5, 1, 8, 1, 2, 3, 6, 6, 7, 3, 7, 7, 3, 9, 8, 7, 2, 0, 6, 8, 2, 3, 0, 2, 7, 7, 1, 8, 5, 5), 0);
  }
}

