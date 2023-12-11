package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021150 Decimal expansion of 1/146.
 * @author Sean A. Irvine
 */
public class A021150 extends PrependSequence {

  /** Construct the sequence. */
  public A021150() {
    super(new PeriodicSequence(0, 6, 8, 4, 9, 3, 1, 5), 0);
  }
}
