package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021706 Decimal expansion of 1/702.
 * @author Sean A. Irvine
 */
public class A021706 extends PrependSequence {

  /** Construct the sequence. */
  public A021706() {
    super(new PeriodicSequence(0, 1, 4, 2, 4, 5), 0);
  }
}

