package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021568 Decimal expansion of 1/564.
 * @author Sean A. Irvine
 */
public class A021568 extends PrependSequence {

  /** Construct the sequence. */
  public A021568() {
    super(new PeriodicSequence(1, 7, 7, 3, 0, 4, 9, 6, 4, 5, 3, 9, 0, 0, 7, 0, 9, 2, 1, 9, 8, 5, 8, 1, 5, 6, 0, 2, 8, 3, 6, 8, 7, 9, 4, 3, 2, 6, 2, 4, 1, 1, 3, 4, 7, 5), 0, 0);
  }
}
