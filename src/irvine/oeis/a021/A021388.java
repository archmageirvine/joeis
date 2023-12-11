package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021388 Decimal expansion of 1/384.
 * @author Sean A. Irvine
 */
public class A021388 extends PrependSequence {

  /** Construct the sequence. */
  public A021388() {
    super(new PeriodicSequence(6), 0, 0, 2, 6, 0, 4, 1);
  }
}
