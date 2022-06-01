package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021459 Decimal expansion of 1/455.
 * @author Sean A. Irvine
 */
public class A021459 extends PrependSequence {

  /** Construct the sequence. */
  public A021459() {
    super(new PeriodicSequence(0, 2, 1, 9, 7, 8), 0);
  }
}
