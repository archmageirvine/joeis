package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021060 Decimal expansion of 1/56.
 * @author Sean A. Irvine
 */
public class A021060 extends PrependSequence {

  /** Construct the sequence. */
  public A021060() {
    super(new PeriodicSequence(8, 5, 7, 1, 4, 2), 0, 1, 7);
  }
}
