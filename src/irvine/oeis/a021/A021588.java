package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021588 Decimal expansion of 1/584.
 * @author Sean A. Irvine
 */
public class A021588 extends PrependSequence {

  /** Construct the sequence. */
  public A021588() {
    super(new PeriodicSequence(7, 1, 2, 3, 2, 8, 7, 6), 0, 0, 1);
  }
}

