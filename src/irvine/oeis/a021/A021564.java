package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021564 Decimal expansion of 1/560.
 * @author Sean A. Irvine
 */
public class A021564 extends PrependSequence {

  /** Construct the sequence. */
  public A021564() {
    super(new PeriodicSequence(8, 5, 7, 1, 4, 2), 0, 0, 1, 7);
  }
}
