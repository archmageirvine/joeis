package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021482 Decimal expansion of 1/478.
 * @author Sean A. Irvine
 */
public class A021482 extends PrependSequence {

  /** Construct the sequence. */
  public A021482() {
    super(new PeriodicSequence(0, 2, 0, 9, 2, 0, 5), 0);
  }
}
