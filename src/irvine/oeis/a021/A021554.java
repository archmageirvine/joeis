package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021554 Decimal expansion of 1/550.
 * @author Sean A. Irvine
 */
public class A021554 extends PrependSequence {

  /** Construct the sequence. */
  public A021554() {
    super(new PeriodicSequence(1, 8), 0, 0);
  }
}
