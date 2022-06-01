package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021269 Decimal expansion of 1/265.
 * @author Sean A. Irvine
 */
public class A021269 extends PrependSequence {

  /** Construct the sequence. */
  public A021269() {
    super(new PeriodicSequence(0, 3, 7, 7, 3, 5, 8, 4, 9, 0, 5, 6, 6), 0);
  }
}
