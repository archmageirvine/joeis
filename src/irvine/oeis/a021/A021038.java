package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021038 Decimal expansion of 1/34.
 * @author Sean A. Irvine
 */
public class A021038 extends PrependSequence {

  /** Construct the sequence. */
  public A021038() {
    super(new PeriodicSequence(2, 9, 4, 1, 1, 7, 6, 4, 7, 0, 5, 8, 8, 2, 3, 5), 0);
  }
}
