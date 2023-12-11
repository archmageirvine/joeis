package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021332 Decimal expansion of 1/328.
 * @author Sean A. Irvine
 */
public class A021332 extends PrependSequence {

  /** Construct the sequence. */
  public A021332() {
    super(new PeriodicSequence(0, 4, 8, 7, 8), 0, 0, 3);
  }
}
