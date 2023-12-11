package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021056 Decimal expansion of 1/52.
 * @author Sean A. Irvine
 */
public class A021056 extends PrependSequence {

  /** Construct the sequence. */
  public A021056() {
    super(new PeriodicSequence(9, 2, 3, 0, 7, 6), 0, 1);
  }
}
