package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021099 Decimal expansion of 1/95.
 * @author Sean A. Irvine
 */
public class A021099 extends PrependSequence {

  /** Construct the sequence. */
  public A021099() {
    super(new PeriodicSequence(1, 0, 5, 2, 6, 3, 1, 5, 7, 8, 9, 4, 7, 3, 6, 8, 4, 2), 0);
  }
}
