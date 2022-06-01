package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021128 Decimal expansion of 1/124.
 * @author Sean A. Irvine
 */
public class A021128 extends PrependSequence {

  /** Construct the sequence. */
  public A021128() {
    super(new PeriodicSequence(8, 0, 6, 4, 5, 1, 6, 1, 2, 9, 0, 3, 2, 2, 5), 0, 0);
  }
}
