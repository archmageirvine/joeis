package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021180 Decimal expansion of 1/176.
 * @author Sean A. Irvine
 */
public class A021180 extends PrependSequence {

  /** Construct the sequence. */
  public A021180() {
    super(new PeriodicSequence(8, 1), 0, 0, 5, 6);
  }
}
