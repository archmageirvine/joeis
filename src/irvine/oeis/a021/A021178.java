package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021178 Decimal expansion of 1/174.
 * @author Sean A. Irvine
 */
public class A021178 extends PrependSequence {

  /** Construct the sequence. */
  public A021178() {
    super(new PeriodicSequence(0, 5, 7, 4, 7, 1, 2, 6, 4, 3, 6, 7, 8, 1, 6, 0, 9, 1, 9, 5, 4, 0, 2, 2, 9, 8, 8, 5), 0);
  }
}
