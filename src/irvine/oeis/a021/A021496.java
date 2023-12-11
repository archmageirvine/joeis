package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021496 Decimal expansion of 1/492.
 * @author Sean A. Irvine
 */
public class A021496 extends PrependSequence {

  /** Construct the sequence. */
  public A021496() {
    super(new PeriodicSequence(2, 0, 3, 2, 5), 0, 0);
  }
}
