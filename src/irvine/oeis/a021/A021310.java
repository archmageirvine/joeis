package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021310 Decimal expansion of 1/306.
 * @author Sean A. Irvine
 */
public class A021310 extends PrependSequence {

  /** Construct the sequence. */
  public A021310() {
    super(new PeriodicSequence(0, 3, 2, 6, 7, 9, 7, 3, 8, 5, 6, 2, 0, 9, 1, 5), 0);
  }
}
