package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021580 Decimal expansion of 1/576.
 * @author Sean A. Irvine
 */
public class A021580 extends PrependSequence {

  /** Construct the sequence. */
  public A021580() {
    super(new PeriodicSequence(1), 0, 0, 1, 7, 3, 6);
  }
}
