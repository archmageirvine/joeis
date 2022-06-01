package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021210 Decimal expansion of 1/206.
 * @author Sean A. Irvine
 */
public class A021210 extends PrependSequence {

  /** Construct the sequence. */
  public A021210() {
    super(new PeriodicSequence(0, 4, 8, 5, 4, 3, 6, 8, 9, 3, 2, 0, 3, 8, 8, 3, 4, 9, 5, 1, 4, 5, 6, 3, 1, 0, 6, 7, 9, 6, 1, 1, 6, 5), 0);
  }
}
