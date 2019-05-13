package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021558 Decimal expansion of 1/554.
 * @author Sean A. Irvine
 */
public class A021558 extends PrependSequence {

  /** Construct the sequence. */
  public A021558() {
    super(new PeriodicSequence(0, 1, 8, 0, 5, 0, 5, 4, 1, 5, 1, 6, 2, 4, 5, 4, 8, 7, 3, 6, 4, 6, 2, 0, 9, 3, 8, 6, 2, 8, 1, 5, 8, 8, 4, 4, 7, 6, 5, 3, 4, 2, 9, 6, 0, 2, 8, 8, 8, 0, 8, 6, 6, 4, 2, 5, 9, 9, 2, 7, 7, 9, 7, 8, 3, 3, 9, 3, 5), 0);
  }
}
