package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021300 Decimal expansion of 1/296.
 * @author Sean A. Irvine
 */
public class A021300 extends PrependSequence {

  /** Construct the sequence. */
  public A021300() {
    super(new PeriodicSequence(3, 7, 8), 0, 0, 3);
  }
}
