package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021410 Decimal expansion of 1/406.
 * @author Sean A. Irvine
 */
public class A021410 extends PrependSequence {

  /** Construct the sequence. */
  public A021410() {
    super(new PeriodicSequence(0, 2, 4, 6, 3, 0, 5, 4, 1, 8, 7, 1, 9, 2, 1, 1, 8, 2, 2, 6, 6, 0, 0, 9, 8, 5, 2, 2, 1, 6, 7, 4, 8, 7, 6, 8, 4, 7, 2, 9, 0, 6, 4, 0, 3, 9, 4, 0, 8, 8, 6, 6, 9, 9, 5, 0, 7, 3, 8, 9, 1, 6, 2, 5, 6, 1, 5, 7, 6, 3, 5, 4, 6, 7, 9, 8, 0, 2, 9, 5, 5, 6, 6, 5), 0);
  }
}
