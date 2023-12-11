package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021218 Decimal expansion of 1/214.
 * @author Sean A. Irvine
 */
public class A021218 extends PrependSequence {

  /** Construct the sequence. */
  public A021218() {
    super(new PeriodicSequence(0, 4, 6, 7, 2, 8, 9, 7, 1, 9, 6, 2, 6, 1, 6, 8, 2, 2, 4, 2, 9, 9, 0, 6, 5, 4, 2, 0, 5, 6, 0, 7, 4, 7, 6, 6, 3, 5, 5, 1, 4, 0, 1, 8, 6, 9, 1, 5, 8, 8, 7, 8, 5), 0);
  }
}
